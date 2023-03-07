package Question1;

interface compre2{
    boolean calc(int a,int b);
}

interface increment{
    int increase(int a);
}

interface concat{
    String add(String s1,String s2);
}

interface upper{
    String upperstring(String s);
}


public class interfaze {
    public static void main(String[] args) {
        concat c1 =(String z,String y) ->z.concat(y);

        upper u1=(String q)->q.toUpperCase();

        increment i1=(int w)-> w++;


        compre2 c2=(int a,int b)->a>b?true:false;

        String s1= "Shashank";
        String s2="daksh";
        System.out.println(c1.add(s1,s2));

        System.out.println(u1.upperstring(s1));

        System.out.println(i1.increase(4));

        System.out.println(c2.calc(7,8));
    }
}



//class writing implements concat , upper , increment ,compre2{


//    public String add(String s1,String s2){
//        String s3= s1.concat(s2);
//        return s3;
//
//    }
//    public String upperstring(String s){
//        return s.toUpperCase();
//    }
//    public int increase(int a){
//        return a++;
//    }
//
//
//     public boolean calc(int a, int b) {
//         return a>b;
//     }
//}