// for inserting and deleting 
public class insert{
    public static void main(String [] args){
       
        StringBuilder sb = new StringBuilder("abcdef");
        System.out.println(sb);
        sb.deleteCharAt(3);
        System.out.println(sb);
        sb.append("xyz");
        System.out.println(sb);
        sb.delete(2,6);// for deleting in a range
        System.out.println(sb);
        sb.insert(2,'g');
        System.out.println(sb);
        sb.insert(2,"hijk");
        System.out.println(sb);

    }
}