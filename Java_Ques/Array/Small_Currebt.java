
public class Small_Currebt {
    public static void main(String[] args) {
        int [] nums = {4,1,2,2,3};
        int [] ans = smallerNumbersThanCurrent(nums);
        for(int i = 0 ;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }

    static int[] smallerNumbersThanCurrent(int[] nums) {
        int [] ans = new int[nums.length];
        for(int i=0;i< nums.length;i++){
            int sum =0;
            for(int j = 0; j<nums.length;j++){
                if(nums[i] > nums[j]){
                    sum ++;
                }
            }
            ans[i] = sum;
        }
        return ans;
    }
}
