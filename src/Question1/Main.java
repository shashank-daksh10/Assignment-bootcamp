package Question1;

import java.util.Random;
import java.util.concurrent.Callable;

class testcall implements Callable {
  int num ;
  public testcall(int num){
      this.num=num;
  }
    @Override
    public Object call() throws Exception {
        return (int)num+ Math.random();
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
       testcall t1 = new testcall(8);
       try {
           System.out.println(t1.call());
       }catch (Exception e){
           System.out.println(e.getMessage());
       }

       Callable<Integer>call=new Callable<Integer>() {
           @Override
           public Integer call() throws Exception {
               int x=30;
               int y=40;
               return x*y;
           }
       };
        Integer result = call.call();
        System.out.println(result);
    }
}
