// sorting only possible in character for sorting 
// in string we need to convert string into character
// for stringbuilder we need to first convert into string 
// then convert into character
import java.util.*;
public class Sorted{
    public static void main(String [] args){
        StringBuilder sb = new StringBuilder("Siddharth");
        char [] ch = sb.toString().toCharArray();
        Arrays.sort(ch);
        for(char ele : ch){
            System.out.print(ele);
        }

    }
}

// here in output 'S' comes first because it have small ascii value