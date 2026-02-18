// Q9 : Given n strings consisting of lowercase English
// alphabets. Print the character that is occurring most
// number of times.

import java.util.*;
public class prob9{
    public static void main(String [] args){

        String s ="abaaacrmnrra";
        int n = s.length();

        int i = 0 ;
        while(i<n){
            char ch = s.charAt(i);
            int index = (int)(ch) - 97;
            frequency[index]++;
            i++;
        }

        int max = -1;

        for( int j = 0 ; j < frequency.length ; j++){
            max = Math.max(max,frequency[j]);
        }

        for(int j = 0 ; j < frequency.length ; j++){
            if(frequency[j]==max){
                char ch = (char)(j+97);
                System.out.println(ch);
            }
        }


    }
}