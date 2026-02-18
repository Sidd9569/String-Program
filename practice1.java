// Q1. Input a string of size n and Update all the odd positions in the string to character ‘#’. Consider 0-based
// indexing.

import java.util.*;
public class practice1{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        int n = s.length();
        for(int i = 0 ; i < n ; i++){
            if(i%2!=0){
                sb.setCharAt(i,'#');
            }
        }

        System.out.println(sb);
    }
}