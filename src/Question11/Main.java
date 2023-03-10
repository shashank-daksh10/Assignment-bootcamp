package Question11;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("shashank",22,213);
        Student s2= new Student("Daksh",22,214);
        Student s3= new Student("pulkit",23,215);

        System.out.println(s1.name());
        System.out.println(s1.equals(s2));
        System.out.println(Student.counter);
    }
}
