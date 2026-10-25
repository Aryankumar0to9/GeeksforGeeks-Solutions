class Solution {
    public String modify(String s) {
       char[] arr = s.toCharArray();
       int left=0;
       int right=arr.length-1;
       
       while(left<right){
       
       while(left<right && !isVowels(arr[left])){
           left ++;
       }
       
       while(left<right && !isVowels(arr[right])){
           right --;
       }
       char temp=arr[left];
       arr[left]= arr[right];
       arr[right]=temp;
       
       left++;
       right--;
    
       }
       return new String(arr);
       }
       
      boolean isVowels(char ch){
          return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
      }
}