// Q10 : Given two strings s and t, determine if they are
//  isomorphic.

import java.util.*;
public class prob10{
    public static void main (String [] args){
        
        String s  = "ead";
        String t = "add";
        int n = s.length();
        boolean flag = true;

        char [] frequency = new char[128];
        for(int i = 0 ; i < n ; i++){
            char ch = s.charAt(i);
            char ch2 = t.charAt(i);
            int index = (int)ch;
            if(frequency[index] == '\0'){
                frequency[index] = ch2;
            }
            else{
                if(frequency[index]!=ch2){
                    flag = false ;
                }
            }
        }

        for( int i = 0 ; i < frequency.length ; i++){
            frequency[i] = '\0';
        }

        for(int i = 0 ; i < n ; i++){
            char ch = t.charAt(i);
            char ch2 = s.charAt(i);
            int index = (int)ch;
            if(frequency[index] == '\0'){
                frequency[index] = ch2;
            }
            else{
                if(frequency[index]!=ch2){
                    flag = false;
                }
            }
        }

        if(flag!=false){
            flag = true;
            System.out.println(flag);
        }
        else{
            System.out.println(flag);
        }

    }
}