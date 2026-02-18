// Input a string of length less than 10 and convert it into integer without using builtin function.
import java.util.*;
public class practice5{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int i = 0 ; 
        int sign = 1; // for positive values
        int result = 0; 

        if(s.charAt(0) == '-'){
            sign = -1;
            i=1;
        }

        for(;i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch < '0' || ch >'9'){
                System.out.println("invalid input ! ");
                break;
            }

            int digit = ch - '0';
            result  = result * 10 + digit;
                
        }

        result = result * sign ; 
        System.out.println(result);
    }
}