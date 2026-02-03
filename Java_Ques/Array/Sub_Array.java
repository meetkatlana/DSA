
public class Sub_Array {
    public static void main(String[] args) {
        
    }

    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int total = 0;
        
        for(int i = 0; i < nums.length; i++){
          total += nums[i];
          if(total > max){
            max = total;
          }
          if(total < 0){
            total = 0;
          }
        }
        return max;

    }
}
