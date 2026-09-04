class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int [] res = new int[n];   // result array should be empty to store result
        res[0] = 1;       // firstmost is 1 stored in res array



        for(int i = 1; i<n; i++){         // works for left 
            res[i] = res[i-1] * nums[i-1];
        }

        int rightprod = 1;
        for(int r= n-1; r>=0; r--){
            res[r] = res[r] * rightprod;    // rightprod one only that why
            rightprod*=nums[r];     // updating tha value
  
        }
         return res;
    }
   
}