
public class Case {
    public static void main(String[] args) {
       String arr = "Siddharth Srivastav" ;
       String brr = "is my Friend";

       System.out.println(arr.toLowerCase()); // for converting into lower case
       System.out.println(arr.toUpperCase()); // for converting into upper case

       String crr = "Mango";
       String drr = "Shake";

       System.out.println(crr.concat(drr));
       System.out.println(crr); // it is still different

       crr = crr.concat(drr); // now both are contact into one
       System.out.println(crr);

       
    }
}
