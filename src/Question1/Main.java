package Question1;

class myThread extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Thread is Running");

            try{
                Thread.sleep(2000);

            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
public class Main {
    public static void main(String[] args) throws  Exception{
        Runnable r1 = new Runnable() { // using Annonymous class
            @Override
            public void run() {
                for(int i=0;i<5;i++){
                    System.out.println("Runnable is running");

                    try{
                        Thread.sleep(2500);
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                }
            }
        };

        myThread t1= new myThread();
        Thread t2 = new Thread(r1);

        t1.start();
        t2.start();


        t1.join();
        t2.join();

        System.out.println("This line executed after  t1 end");
        System.out.println("This line executed after t2 end");

    }
}
