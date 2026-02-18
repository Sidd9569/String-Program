// Q4 : Return the total number of digits in a number without
// using any loop.

import java.util.*;
public class strProb4{
    public static void main( String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = Integer.toString(n);// convert an integer into string
        System.out.println(s);
        System.out.println(s.length());

        System.out.println();


        // without using built in function 
        int m = n;
        String k = "";
        k = k + n;
        System.out.println(k); 
        System.out.println(k.length());
    }
}