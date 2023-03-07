package Question2;

interface adding{
    int add(int a,int b);
}
interface subtracting{
    int sub(int a,int b);
}

interface multiply{
    int multi(int a,int b);
}


class add2{
    int addition(int a,int b){
        return a+b;
    }
}
class sub2{
     int subtraction(int a,int b){
        return b-a;
    }
}
class multi2{
    static int multiplies(int a,int b){
        return a*b;
    }
}

public class main {
    public static void main(String[] args) {

        add2 ad1 = new add2();
        adding ad= ad1::addition;

        sub2 sb1 = new sub2();

        subtracting sb =sb1::subtraction;

        System.out.println(ad.add(8,9));
        System.out.println(sb.sub(5,9));

        //this is for static reference
        //interface object=class :: function


        multiply ml= multi2::multiplies;

        System.out.println(ml.multi(9,5));

    }
}
