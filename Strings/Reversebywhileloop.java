

public class Reversebywhileloop {
    

    public static String reverse(String s){
        char[] charA=s.toCharArray();
        int first=0;
        int last=charA.length-1;

        while(first<last){
            char temp=charA[first];
            charA[first]=charA[last];
            charA[last]=temp;
            first++;
            last--;
        }
        return new String(charA);
    }
    public static void main(String[] args) {
        String s="king";
        String ans=reverse(s);
        System.out.print(ans);
        
       
}
}