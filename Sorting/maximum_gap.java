class Solution {
    int maxDiff(int[] arr) {
      
       Arrays.sort(arr);
        int ans=0;
        for(int i=0; i<arr.length-1;i++){
             ans=Math.max(ans,arr[i+1]-arr[i]);
            
        }
        return ans;
    }
}

// this is using sorting 