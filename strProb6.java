// Q6 : Input a string and toggle all the characters of it.
// (Replace small case with capital case & vice versa)

import java.util.*;
public class strProb6{
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        int n = sb.length();
        for(int i = 0 ; i < n; i++){
            char ch = sb.charAt(i);
            int ascii = (int)ch;
            if(ch>=65 && ch<=90){
                ascii = ascii + 32;
            }
            
            else if(ch>=97 && ch<=122){
                ascii = ascii - 32;
            }
            ch = (char)ascii;
            sb.setCharAt(i,ch);
        }
        System.out.println(sb);
    }
}