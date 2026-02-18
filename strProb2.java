// Q2 : Input a string and print all the substrings of that string.
public class strProb2{
    public static void main(String [] args){

        String arr = "abcd";
        
        for(int i = 0 ; i < arr.length(); i++){
            for( int j = i+1 ; j <= arr.length(); j++){
                System.out.print(arr.substring(i,j) + " ");
            }
        }
    }
}