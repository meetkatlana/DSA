

public class ArrayConcatenation {
    public static void main(String[] args) {
        int [] nums ={1,2,1};
        int [] ans =  new int[(2*nums.length)];
       for(int i = 0 ;i<nums.length; i++){
        ans[i] = nums[i];
       }
       for(int i = nums.length; i < ans.length; i++){
        ans[i] = nums[i-nums.length];
       }
    
         for(int i = 0 ;i<ans.length; i++){
          System.out.print(ans[i] + " ");
         }
}
}