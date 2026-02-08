
public class three_sum_target {
    public static void main(String[] args) {
        int [] nums = {0,0,0};
        int target = 1;
        
        int sum = nums[0] + nums[1] + nums[2];
        for(int i = 0; i < nums.length -2; i++){
            int left = i +2;
            int right = nums.length - 1;
            while(left < right){
                int temp = nums[i] + nums[left] + nums[right];
                if(Math.abs(temp - target) < Math.abs(sum - target)){
                    sum = temp;
                }

                if(sum < target){
                    left++;
                }
                else if(sum > target){
                    right--;
                }
                else{
                    System.out.println(temp);
                    System.exit(0);
                }

            }
        }
        System.out.println(sum);
    }
}