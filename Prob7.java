// take input a stringbuilder &  reverse it without 
// using builtin function 
import java.util.*;
public class Prob7{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());

        
        int n = sb.length();
        System.out.println(n); 
        int i = 0 ;
        int j =  n-1;

        while(i<j){
            char Temp = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j, Temp);
            i++;
            j--;
        }

        System.out.println(sb);
        
    }
}