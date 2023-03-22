package Question2;
import java.util.concurrent.locks.ReentrantLock;

class bank extends Thread{//can remove "extend thread" here.
    int bal;
    private ReentrantLock lock= new ReentrantLock();// so that can be called

    public bank(int bal) {
        this.bal = bal;
    }

    public void updateBalnace(int amt) {
        lock.lock();
        try {
            bal+=amt;
            System.out.println(Thread.currentThread().getName() + "  lock acquired and balance is "
                    + bal);
        }

        finally {
            System.out.println(Thread.currentThread().getName() + " lock released");
            lock.unlock();
        }
    }

    public void withdraw(int amont){
        lock.lock();
        try{
            if(bal<amont) {
                System.out.println("error");
                throw new IllegalArgumentException();
            }
            else{
                System.out.println(Thread.currentThread().getName()+"lock acquired for withdraw" );
                bal=bal-amont;
            }
        }finally {
            System.out.println(Thread.currentThread().getName()+"lock relesed and balance is "+
                    bal);

            lock.unlock();
        }
    }

}
public class main{
    public static void main(String[] args) {
        bank b= new bank(100);

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                b.updateBalnace(100);
                b.withdraw(20);
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                b.updateBalnace(-100);
                b.withdraw(20);
            }
        });

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                b.updateBalnace(100);
                b.withdraw(20);
            }
        });
        t1.start();
        t2.start();
        t3.start();
    }
}