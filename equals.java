public class equals{
    public static void main(String [] args){
        
        String a = "Siddharth";
        String b = "Sidd";
        b = b + "harth";
        
        System.out.println(a==b);// comparing memory for that

        String c = new String(a);
        System.out.println(a.equals(c));// String character compairing one by one ;

        
    }
}