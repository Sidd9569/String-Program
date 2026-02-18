// Q6. Input a string and concatenate with its reverse string and print it.
import java.util.*;
public class practice6{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        int n = s.length();

        int i = 0 ; 
        int j  = n-1;
        while(i<=j){
            char temp = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);
            i++;
            j--;
        }

        sb.append(s);
        System.out.println(sb);



    }
}