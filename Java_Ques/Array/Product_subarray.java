
public class Product_subarray {
    public static void main(String[] args) {
        
    }
     public int numSubarrayProductLessThanK(int[] nums, int k) {
        int ans = 0 , prod = 1 , left = 0;
        for(int i = 0; i < nums.length ; i++){
            prod *= nums[i];
            if(prod >= k){
                prod /= nums[left];
                left++;
            }
            ans += i - left + 1;
        }
        return ans;
    }
}