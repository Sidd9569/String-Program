//  Q5 : Input a string and Update all the even positions in the
// string to character ‘a’. Consider 0-based indexing.

import java.util.*;
public class strProb5{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in); 
        String s = sc.nextLine();
        String q = "";
        for(int i = 0 ; i < s.length() ; i++){
            if(i%2 == 0){
                q = q + 'a';
            }
            else{
                q = q + s.charAt(i);
            }
        }
        s = q;
        System.out.println(s);
    }
}