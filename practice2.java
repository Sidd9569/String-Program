// Q2. Input a string of length n and count all the consonants in the given string.

import java.util.*;
public class practice2{
    public static void main(String [] args){
        Scanner sc  = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        int count =  0 ;
        for(int i = 0; i < n ; i++){
            char ch = s.charAt(i);
            if(ch>='a' && ch <='z'){
                if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u'){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}