class Solution {
    public ArrayList<Integer> findElements(int[] arr) {
        
        int n=arr.length;
        Arrays.sort(arr);
        ArrayList<Integer> ans= new ArrayList<>();
        
        for(int i=0; i<n-2; i++){
            ans.add(arr[i]);
        }
        return ans;
    }
}