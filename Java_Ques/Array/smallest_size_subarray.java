
public class smallest_size_subarray {
    public static void main(String[] args) {
        int [] arr = {2,3,1,2,4,3};
        int k = 7;

        int minLen = Integer.MAX_VALUE;
        int sum = 0;
        int start = 0;

        for(int i = 0 ;i < arr.length; i++){
           sum += arr[i];
            
           while(sum >= k){
            sum -= arr[start];
            minLen = Math.min(minLen, i - start + 1);
            start++;
           }

        }
        System.out.println(minLen);

    }
}