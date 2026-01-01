import java.util.*;
public class strbuiltIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String i = sc.next();

        System.out.println(str.indexOf(i));// Gives the starting index (one from start)

        System.out.println(str.lastIndexOf(i)); // Gives the last index of that char (one from the last)

        String a ="abc";
        String b ="abc";
        System.out.println(a.compareTo(b));//compare the value lexographically using there ascii value

        String c = "abc";
        String d = "acd";
        System.out.println(c.compareTo(d));

        String e = "abc";
        String f = "acc";
        System.out.println(e.compareTo(f));

        String g = "abcddd";
        String h = "abc";
        System.out.println(g.compareTo(h));
    }
}
