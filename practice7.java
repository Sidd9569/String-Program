// Q7. Find the second largest digit in the string consisting of digits from ‘0’ to ‘9’.

import java.util.*;
public class practice7{
    public static void main(String [] args){

        String [] arr ={"42356924","0082","000891","62"};

        String smax = "0";
        String maxs = arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            
            if(max(maxs , arr[i]).equals(arr[i])){
                smax = maxs;
                maxs = arr[i]; 
            }

            else if(!arr[i].equals(maxs) && max(arr[i],smax).equals(arr[i])){
                smax = arr[i];
            }
        }
        System.out.println(maxs);
        System.out.println(smax);
    }

    public static String max(String a,String b){
        String s = purify(a);
        String t = purify(b);
        
        if(s.length()> t.length()){
            return a;
        }
        if(s.length() < t.length()){
            return b;
        }

        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i)!=t.charAt(i)){
                if(s.charAt(i)>t.charAt(i)){
                    return a;
                }
                else{
                    return b;
                }
            }
        }

        if(a.length()>=b.length()){
            return a ;
        }
        else{
            return b;
        }



    }

    public static String purify(String s){
        for( int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i)!='0'){
                return s.substring(i);
            }
        }
        return s;
    }
}