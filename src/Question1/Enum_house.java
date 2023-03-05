package Question1;

import java.util.Scanner;

public class Enum_house {

    enum House {
        FLAT("Flat", 100000),
        APARTMENT("Apartment", 500000),
        VILA("Vila", 200000),
        MANSION("Mansion", 3000000);

        private final String name;
        private final double price;


        House(String name, double price) {

            this.name = name;
            this.price = price;
        }


        public double getPrice() {
            return price;
        }

        public String getName() {
            return name;
        }
    }
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Choose house type to know the cost "+"\n"+ "*******Options******"+"\n"+
                "Flat"+"\n"+"Apartment"+"\n"+"Vila"+"\n"+"Mansion"+"\n");
        System.out.println("enter a house type :");
        String user_input = sc.nextLine();
        String h1 = user_input.toUpperCase();
        System.out.print("Cost of " + h1 + " is: Rs ");

        switch (h1) {
            case "FLAT"-> {
                House flat = House.FLAT;
                System.out.println(flat.getPrice());
            }
            case "APARTMENT" -> {
                House apartment = House.APARTMENT;
                System.out.println(apartment.getPrice());
            }
            case "VILA" -> {
                House vila = House.VILA;
                System.out.println(vila.getPrice());
            }
            case "MANSION" -> {
                House mansion = House.MANSION;
                System.out.println(mansion.getPrice());
            }
        }


    }



}
