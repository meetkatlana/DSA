import java.util.Scanner;

public class First_Last_Position  {
    public static void main(String[] args) {
        
    }
    public int[] searchRange(int[] nums, int target) {
        int [] ans = {-1 ,-1};
         int first = 0 , last = nums.length -1;

        while(first <= last){
            int mid = first + (last - first) /2;
            if(nums[mid] == target){
                ans[0] = mid;
                last = mid - 1;
            }
            else if(nums[mid] < target){
                first = mid + 1;
            }
            else{
                last = mid - 1;
            }
        } 
        first = 0 ;
         last =  nums.length - 1;
         while(first <= last){
            int mid = first + (last - first) /2;
            if(nums[mid] == target){
                ans[1] = mid;
                first = mid + 1;
            }
            else if(nums[mid] < target){
                first = mid + 1;
            }
            else{
                last = mid - 1;
            }
        } 
        return ans;
    }

}