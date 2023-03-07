package Question4;
interface dummy{
    void show();
}
class write{
    write(){
        System.out.println("this is write");
    }
}
class Main{
    Main(){
        System.out.println("This is the main constructor");
    }
    public static void main(String[] args) {

        dummy d=write::new; // here we put the value of constructor from different class.
        dummy d1 = Main::new;
        d.show();
        d1.show();
    }
}