package Question1;

import java.util.ArrayList;
import java.util.List;

interface MyPredicate<T>{
    boolean operation(T t );
}
public class Predicating {
    public static void main(String[] args) {
     List<Car> l1=new ArrayList<>();
     l1.add(new Car("Toyota","innova",3000000));
     l1.add(new Car("BMW","S-series",4500000));
     l1.add(new Car("Maruti","celerio",34520));
     l1.add(new Car("Renault","Quid",1000000));


        System.out.println(l1);

        MyPredicate<Car>m1=a->a.getBrand().contains("M");

        for(Car c:l1){
            if(m1.operation(c)) {
                System.out.println(c.getName()+" "+c.getPrice());

            }
        }
    }
}

class Car{
    String brand;
    String name;
    int price;

    public Car(){

    }
    public Car(String brand, String name, int price) {
        this.brand = brand;
        this.name = name;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

