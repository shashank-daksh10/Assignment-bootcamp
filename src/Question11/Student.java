package Question11;

public record Student(String name, int age, int id) {
    static int counter=0;

    // below we are overriding constructor
    // argument must be in same order as defined in record
    // we can add more method in constructor too as we did here
    public Student(String name, int age, int id){
        this.name=name;
        this.age=age;
        this.id=id;

        counter++;
    }
}

// we can add more method in records too but they must not change the
// value of the object.