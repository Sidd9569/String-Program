import java.util.*;
public class Append{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Abc");
        int n = 342;
        sb.append(n);// it makes integer as a String into this
        System.out.println(sb);

        StringBuilder s = new StringBuilder("pqr");
        sb.append(s);
        System.out.println(sb);

        char [] ch = {'a','m','n'};
        sb.append(ch);
        System.out.println(sb);

        int [] arr ={1,2,3};
        sb.append(arr);// it added its address into it
        System.out.println(sb);


        // when we try to add like this

        // sb = sb + "mnq"; error we cannot add like this 
        // System.out.println(sb);

    }
}