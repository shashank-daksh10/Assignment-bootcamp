package Question3;

import java.util.ArrayList;
import java.util.List;

class counter{
    int count =0;
    int sum=0;
    List<Integer> li=new ArrayList<>();
    public synchronized void increase(){//synchro method
        count++;

    }
    public void add(int a){//synchro block
        li.add(a);
        synchronized (this){
            sum+=a;
        }
    }
}
public class synchroMethod {
    public static void main(String[] args) throws Exception  {

        counter c= new counter();
        Thread t1 = new Thread(()->{
            for (int i=0;i<800;i++){
                c.increase();
                c.add(5);
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<800;i++){
                    c.increase();
                    c.add(6);
                }
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();



        // if u run the below statement without synchronized in method increase the calls for counter
        // might come less than 1600 .
        System.out.println("Total calls are   " +c.count);
        System.out.println("Total sum is   " +c.sum);

        //since we dont use sync method here the count of list will differ.
        System.out.println(c.li.stream().count());
    }
}