import java.util.ArrayList;
import java.util.Arrays;
class removeDuplicate {
    public static void main(String[] args) {
        int target =45;
        int [] arr={12,23,34,45,56};
     ArrayList<Integer> ans= new ArrayList<>();
        for(int i=0; i<arr.length;i++){
            if(arr[i]!=target){
                ans.add(arr[i]);
                
            }
        }
        System.out.print(ans);
    }
}