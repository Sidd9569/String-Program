public class plusOperator{
    public static void main(String [] args){

        String s = "abc";
        String t = "pqr";

        s += t;

        System.out.println(s);
        s = 10 + s;
        System.out.println(s);

        String a = "mno";
        a = a + 10 + 20;
        System.out.println(a);

        String b = "xyz";
        b = 10 + 20 + b;
        System.out.println(b);

    }
}