
public class No_Duplicate {
    public static void main(String[] args) {
        
    }
     public int singleNumber(int[] nums) {
        int ans = nums[0];
        for(int i = 1; i < nums.length; i++){
            ans = ans ^ nums[i];
        }
        return ans;
    }
}