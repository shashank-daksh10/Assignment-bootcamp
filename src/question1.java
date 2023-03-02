
public class question1 {

    private static String firstName;
    private static String lastName;
    private static int age;

    public question1(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // Static block
    static {
        System.out.println("First Name: SHASHANK");
        System.out.println("Last Name: DAKSH");
        System.out.println("Age: 21");
    }

    // Static Method
    public static void printNameAndAge() {
        System.out.println("SHASHANK DAKSH, 21");
    }

    // Static Variable
    //public static int age = 21;

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }
    public static void main(String[]args){
        printNameAndAge();
        question1 p=new question1("Pukit","Naraine",21);
        System.out.println(p.getFirstName());
        System.out.println(p.getLastName());

    }
}
