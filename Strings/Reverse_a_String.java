

public class Reverse_a_String {

    public static String reverseString(String s){
       return new StringBuilder(s).reverse().toString();
    }

    public static void main(String[] args){
        String s="king";
        String ans=reverseString(s);
        System.out.print(ans);
    }
    
}
