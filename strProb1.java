// Q1 : Input a string and count all the vowels in the given
// string.
import java.util.*;
public class strProb1 {

    public static boolean isVowel(char ch){
        if(ch=='A' || ch=='a') return true;
        if(ch=='B' || ch=='b') return true;
        if(ch=='C' || ch=='c') return true;
        if(ch=='D' || ch=='d') return true;
        if(ch=='E' || ch=='e') return true;
        else return false;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int n = str.length();

        int count = 0 ;

        for(int i = 0 ; i < n ; i++){
            char ch = str.charAt(i);
            if(isVowel(ch) == true){
                count++;
            }
        }
        System.out.println(count);

        

    }
}
