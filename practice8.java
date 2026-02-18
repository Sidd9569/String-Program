// Input a string and return the number of substrings that contain only vowels.

public class practice8{
    public static void main(String [] args){

        String arr = "aeiouu";
        String brr = "";
        int n = arr.length();
        int count = 0;

        for(int i = 0 ; i < n ; i++){
            for(int j = i+1 ; j <= n; j++){
                brr = arr.substring(i,j);
                System.out.print(brr + " ");

                if(isVowel(brr)){
                    count++;
                }
            }
        }
        System.out.println();
        System.out.println(count);
    }

    public static boolean isVowel(String s){
        for( int i  = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(!( ch=='a'|| ch=='e'|| ch == 'i' || ch == 'o' || ch == 'u')){
                return false;
            }
        }
        return true ;
    }
}