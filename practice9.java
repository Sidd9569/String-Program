// Q9. Given an array of strings. Check whether they are anagram or not.

import java.util.*;
public class practice9{
    public static void main(String [] args){
        String [] arr = {"eat","tea","ate"};
        int n = arr.length;
        boolean flag = true;

        for(int i = 0 ; i < n ; i++){
            arr[i] = sort(arr[i]);
        }

        for(int i = 1 ; i < n ; i++){
            if(!arr[i].equals(arr[0])){
                flag = false;
            }
        }

        if(flag!=true){
            System.out.println("not an anagram");
        }
        else{
            System.out.println("anagram");
        }

        for(String ele : arr){
            System.out.print(ele + " ");
        }
        
    }

    public static String sort(String s){
        char [] ch = s.toCharArray();
        Arrays.sort(ch);
        String a = Arrays.toString(ch);
        return a;
    }


}