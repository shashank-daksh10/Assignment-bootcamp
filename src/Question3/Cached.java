package Question3;



import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class test1 extends Thread{
    String name;
    int age;
    public test1(String name,int age){
        this.name=name;
        this.age=age;
    }
    @Override
    public void run(){
        try{
            for(int i=0;i<5;i++){
                if(i<2){
                    System.out.println(Thread.currentThread().getName()+" have"+" "+name+" "+age);
                }
                else {
                    System.out.println(Thread.currentThread().getName() + " " + "have displayed 2 time");
                }
                Thread.sleep(500);
            }
            System.out.println("process Ended***********");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
public class Cached {
    public static void main(String[] args) {
        Thread t1 = new test1("shashank",22);
        Thread t2 = new test1("pulkit",23);
        Thread t3 = new test1("abhinav",22);
        Thread t4 = new test1("daksh",23);
        Thread t5 = new test1("naraine",24);

        ExecutorService ex = Executors.newCachedThreadPool();
        ex.submit(t1);
        ex.submit(t2); // execute and submit do same work???
        ex.execute(t3);
        ex.execute(t4);
        ex.execute(t5);
    }
}

