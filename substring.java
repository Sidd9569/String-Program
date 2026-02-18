public class substring{
    public static void main(String [] args){
        String arr = "Mango";
        System.out.println(arr.substring(2));

        System.out.println("-->" + arr.substring(2,2));// it shows empty the the first (2) & the last (n-1) both are same ;

        System.out.println(arr.substring(2,5));  // it contains all the elements from 2 to (5-1) elements in this;
    }
}