
public class Array_Shuffle {
    public static void main(String[] args) {
       int [] nums = {2,5,1,3,4,7};
       int n = nums.length/2;
       int [] ans = shuffle(nums, n); 
        for(int i = 0 ;i < nums.length;i++){
            System.out.print(ans[i] + " ");
        }
    }
   
    static  int[] shuffle(int[] nums, int n) {
        int [] ans = new int[nums.length];
         int temp = 0;
        for(int i = 0 ; i < nums.length ;i++){
               ans[i] = nums[temp];
               temp++;
               i++;
               ans[i] = nums[n];
               n++;    
        }
        return ans;
    }
}