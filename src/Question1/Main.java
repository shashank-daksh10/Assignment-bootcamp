package Question1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
       List<Float>li=new ArrayList<>();
       li.add(7.8f);
       li.add(77.8F);
       li.add(81216732.323433f);
       li.add(997810902.8789230f);
       li.add(39829f);

       Float sum=0.0f;
       Iterator<Float> it = li.iterator();
       while(it.hasNext()){
           sum+=it.next();
       }


       System.out.println(sum);




    }
}