//Given an array of positive integers nums and a positive integer target, return the minimal length of a 
// subarray
//  whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.

class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        //sliding window technique
       int start=0;
       int sum=0;
       int end=0;
       int leng = Integer.MAX_VALUE;
       while(end<nums.length){
           sum+=nums[end];
           while(sum>=target){
               sum-=nums[start];
              
               leng = Math.min(leng,end-start+1);
                start+=1;

           }
           
           end++;
       }
       if(leng== Integer.MAX_VALUE) return 0;
      return leng;

    }
}
