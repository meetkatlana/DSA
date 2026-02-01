import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Three_sum {
    public static void main(String[] args) {
        
    }
    public void twosum(int f, int [] nums, List<List<Integer>> res){
        int i = f+1 , j = nums.length-1;
        while(i < j){
            int sum = nums[f] + nums[i] + nums[j];
            if(sum > 0){
                j = j - 1;
            }
            else if (sum < 0){
                i = i + 1;
            }
            else{
             res.add(Arrays.asList(nums[f] , nums[i] , nums[j]));
                i = i+1;
                j =j-1;
                while(i < j && nums[i] == nums[i -1]){
                    i = i+1;
                }
                while(i < j && nums[j] == nums[j +1]){
                    j = j -1;
                }
            }
        }
    }
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int f = 0;f<nums.length;f = f+1){
            if(nums[f] > 0){
                break;
            }
            if(f == 0 || nums[f] != nums[f-1]){
                twosum(f,nums,res);
            }
        }
        return res; 
    }
}