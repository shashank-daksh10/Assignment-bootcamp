package Question4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

class random implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
        Thread.sleep(1000);
        int x=ThreadLocalRandom.current().nextInt();// used to get random value.
        return x;
    }
}
public class Main {
    public static void main(String[] args){
        ExecutorService ex = Executors.newFixedThreadPool(10);
        Future<Integer>future;
        List<Future<Integer>>li= new ArrayList<>();
        for(int i=0;i<5;i++){
            future=ex.submit(new random());
            li.add(future);
        }
        for(Future x:li){
            try {
                System.out.println(x.get());
            }catch (Exception e){
                System.out.println("Interruption occur");
                e.printStackTrace();
            }

        }
    }
}
