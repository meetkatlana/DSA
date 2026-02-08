
public class Remove_element {
    public static void main(String[] args) {
        
    }
    public int removeElement(int[] nums, int val) {
        int ans = 0;
        int i = 0;
        while(i < nums.length){
            if(nums[i] != val){
                nums[ans] = nums[i];
                ans++;
            }
            i++;
        }
        return ans;
    }
}
