// convert string to string array
import java.util.*;
public class convertintostring{
    public static void main(String [] args){
        String  s = "the sky is blue";
        String[] ch = s.split(" ");
        int n = ch.length;
        System.out.println(n);
        for(String ele : ch){
            System.out.println(ele);
        }
    }
}