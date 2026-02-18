// ✅ LeetCode 443 — String Compression
public class prob12{
    public static void main(String [] args){
        String s ="aaaabbcddeff";
        char [] arr = s.toCharArray();
        String ans ="";
        
        int i = 0;
        int j = 0;

        while(j<arr.length){
            if(arr[i] == arr[j]){
                j++;
            }
            else{
                ans = ans + arr[i];
                int len = j-i;
                if(len>1){
                    ans = ans + len ;
                }
                i = j ;
            }
        }
        ans = ans + arr[i];
        int len = j-i;
        if(len>1){
            ans = ans + len ;
        }

        System.out.println(ans);


    }
}