package Question4;

public class Main {
    public static void main(String[] args) {
        String s1= "shashank";
        String s2="Abhinav";

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (s1){
                    System.out.println(Thread.currentThread().getName()+" "+"have shashank");

                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                synchronized (s2){
                    System.out.println(Thread.currentThread().getName()+" "+"have Abhinav");
                }
            }
        };
    });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (s2){
                    System.out.println(Thread.currentThread().getName()+" "+"have Abhinav");

                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    synchronized (s1){
                        System.out.println(Thread.currentThread().getName()+" "+"have shashank");
                    }
                }
            };
        });
        t1.start();
        t2.start();
  }
}
