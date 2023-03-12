package Question8;
class Myclass implements AutoCloseable{
    public void testing(){
        System.out.println("My class is running");
    }

    @Override
    public void close() throws Exception {
        System.out.println("closing the Myclass");
    }
}
public class Main {
    public static void main(String[] args) {
        try(Myclass m1=new Myclass();){
            m1.testing();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
