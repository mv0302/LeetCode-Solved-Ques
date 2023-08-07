// You are given an m x n integer matrix matrix with the following two properties:

// Each row is sorted in non-decreasing order.
// The first integer of each row is greater than the last integer of the previous row.
// Given an integer target, return true if target is in matrix or false otherwise.

// You must write a solution in O(log(m * n)) time complexity.

//Time comp. of my solution - O(mlogn)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int row = matrix.length;
        int col = matrix[0].length;

        for(int i=0;i<row;i++){
            if(matrix[i][0]==target) return true;
            
           if (matrix[i][0] <= target && matrix[i][col - 1] >= target) {
                if (search(matrix[i], target)) {
                    return true;
                }
            }
      
        
    }
      return false;
    }

     public boolean search(int[] row, int target){
       int left = 0;
        int right = row.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (row[mid] == target) {
                return true;
            } else if (row[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
       

    }
}
