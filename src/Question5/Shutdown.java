package Question5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class test extends Thread{
    String name;
    int age;
    public test(String name,int age){
        this.name=name;
        this.age=age;
    }
    @Override
    public void run(){
        try{
            for(int i=0;i<2;i++){
                if(i==0){
                    System.out.println(Thread.currentThread().getName()+" have"+" "+name+" "+age);
                }
                else {
                    System.out.println(Thread.currentThread().getName() + " " + "have displayed ");
                }
                Thread.sleep(500);
            }
            System.out.println("process Ended***********");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
public class Shutdown {
    public static void main(String[] args) {
        Thread t1 = new test("shashank",22);
        Thread t2 = new test("pulkit",23);
        Thread t3 = new test("abhinav",22);
        Thread t4 = new test("daksh",23);
        Thread t5 = new test("naraine",24);

        ExecutorService ex = Executors.newFixedThreadPool(5);
        ex.execute(t1);
        ex.execute(t2);
        ex.execute(t3);
        ex.shutdown();
        ex.execute(t4);
        ex.execute(t5);
    }
}
