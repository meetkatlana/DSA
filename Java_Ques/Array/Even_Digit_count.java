
public class Even_Digit_count {
    public static void main(String[] args) {
        
    }
    static int findNumbers(int[] nums) {
        int even_no = 0;
        for(int i = 0; i < nums.length; i++){
             int check = 0;
             int num = nums[i];
            while(num != 0){
                check++; 
                num /= 10;
            }
            if(check % 2 == 0){
                even_no++;
            }
        }
        return even_no;
    }

}