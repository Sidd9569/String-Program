// Q8 : Given two strings s and t, return true if t is an anagram
// of s, and false otherwise.

import java.util.*;
public class anagram{
    public static void main(String [] args){

        String s = "anagram";
        String t  = "nagaram";
        
        char [] ch1 = s.toCharArray();
        char [] ch2 = t.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(s.length() != t.length()){
            System.out.println("False");
        }

        for( int i = 0 ; i < ch1.length ; i++){
            if(ch1[i]!= ch2[i]){
                System.out.println("False");
            }
        }
        System.out.println("true");
    }
}