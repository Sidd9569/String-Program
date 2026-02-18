// Q10. Given a sentence ‘str’, return the word that is lexicographically maximum.

import java.util.*;
public class practice10{
    public static void main(String [] args){

        String str = "apple mango banana zebra";
        String [] arr = str.split(" ");
        
        String maxword = arr[0];
        int n = arr.length;

        for(int i = 1 ; i < n ; i++){
            if(arr[i].compareTo(maxword)>0){
                maxword =  arr[i];
            }
        }

        System.out.println(maxword);
    }
}