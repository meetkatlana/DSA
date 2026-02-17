import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum4 {
    public static void main(String[] args) {
        
    }
     public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
       List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;
        for(int i = 0; i < len - 3; i++){
             if (i > 0 && nums[i] == nums[i - 1]) continue;
            for(int j = i+1; j < nums.length-2;j++){
            if (j > i + 1 && nums[j] == nums[j - 1]) continue;
              int left = j + 1 , right = nums.length - 1;
               while(left < right){
               int sum = nums[i] + nums[left] + nums[right] + nums[j];
                if(sum < target){
                 left++;
                }
                else if(sum > target){
                 right--; 
                 }
                else{
                  res.add(Arrays.asList(nums[i],nums[left],nums[right],nums[j]));
                  left++;
                  right--;
                  while (left < right && nums[left] == nums[left - 1]){
                    left++;
                  }
                  while (left < right && nums[right] == nums[right + 1]){
                    right--;
                  }
                 }
             }
           }
        }
        return res;
    }
}