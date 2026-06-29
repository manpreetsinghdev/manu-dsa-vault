/*
-------------------------------------------------------
Problem    : Three Sum
Platform   : Rising Brains
Topic      : Arrays
Difficulty : Medium
Approach   : Sorting + Two Pointers

Time Complexity  : O(n²)
Space Complexity : O(1) (excluding output list)

Solved On  : 25-06-2026
-------------------------------------------------------
*/


import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


class solution{
    
    public List<List<Integer>> Threesum(int[] nums){
        

        List<List<Integer>> res = new ArrayList<>();

        int n =  nums.length;
        Arrays.sort(nums);

        for(int i =0; i<n-2; i++){
            //remove duplicates
            if(i>0 && nums[i] == nums[i-1]) continue;

            //initializing left right pointer
            int l = i+1; int r = n-1;

           
           while(l<r){
            int sum = nums[i] + nums[l] + nums[r];
            if(sum == 0){
                res.add(Arrays.asList(nums[i], nums[l], nums[r]));   
                // Condition for prev check becz it come again 

                while(l<r && nums[l] == nums[l+1]) l++;
                while(l<r && nums[r] == nums[r-1]) r--;

                //for moving l  ahead and r backward 

                l++;
                r--;

            }
            else if (sum>0){
                r--;
            }
            else{
                l++;
            }
           }
        }
        return res;
    }
    }


    public class Threesum {

        public static void main(String[] args) {
    
            solution obj = new solution();
    
            int[] nums = {-1,0,1,2,-1,-4};
    
            System.out.println(obj.Threesum(nums));
        }
    }
