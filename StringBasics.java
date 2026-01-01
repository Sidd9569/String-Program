import java.util.*;
public class StringBasics {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        //declaration of array
        String arr = "Siddharth Srivastav";
        System.out.println(arr);

        // This is only for reading or declaring one string

    //    String brr  = sc.next();   // here space is consider as different string
      
        // Suppose we take "Siddharth is my friend"

        // System.out.println(brr);  // ----> Siddharth 


        //This is for declaring or reading complete line 

        String crr = sc.nextLine();// here we consider complete

        // "Siddharth is my friend"

        System.out.print(crr);  // "Siddharth is my friend"


        
    }
}
