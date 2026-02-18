// Q4. Input a string of even length and reverse the second half of the string.

import java.util.*;
public class practice4{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char [] arr = s.toCharArray();
        int n = arr.length;
        int i = n/2 ;
        int j = n-1;
        while(i<=j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        for(char ele : arr){
            System.out.print(ele);
        }


    }
}