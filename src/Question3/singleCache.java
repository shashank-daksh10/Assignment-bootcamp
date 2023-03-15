package Question3;



import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class test2 extends Thread{
    String name;
    int age;
    public test2(String name,int age){
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
public class singleCache {
    public static void main(String[] args) {
        Thread t1 = new test2("shashank",22);
        Thread t2 = new test2("pulkit",23);
        Thread t3 = new test2("abhinav",22);
        Thread t4 = new test2("daksh",23);
        Thread t5 = new test2("naraine",24);

        ExecutorService ex = Executors.newSingleThreadExecutor();
        ex.execute(t1);
        ex.execute(t2);
        ex.execute(t3);
        ex.execute(t4);
        ex.execute(t5);
    }
}

