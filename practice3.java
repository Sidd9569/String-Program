// Q3. Check whether the given string is palindrome or not.

import java.util.*;
public class practice3{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        
        int i = 0 ;
        int j = n-1;
        boolean flag = true; 

        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                flag = false;
            }
            i++;
            j--;
        }

        if(flag!=true){
            System.out.println("not a palindrome");
        }
        else{
            System.out.println("palindrome");
        }
        

    }
}