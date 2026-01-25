
public class Missing_term {
    public static void main(String[] args) {
        
    }
     static int missingNumber(int[] nums) {
      int len = nums.length;
      int ans = len;
      for(int i = 0; i < len; i++){
         ans += i - nums[i];
      }
     return ans;
    
}
}