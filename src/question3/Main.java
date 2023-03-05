package question3;

public class Main {
    public static void main(String[] args) {
           MinStack st = new MinStack();
           st.push(10);
           st.push(28);
           st.push(33);
           st.push(9);

        System.out.println(st.pop());
        System.out.println(st.getMin());

        st.push(3);
        st.push(77);
        System.out.println(st.top());

        System.out.println(st.getMin());


    }



}
