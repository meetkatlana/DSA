
public class max_subarray_k {
    public static void main(String[] args) {
        int [] arr = {100,200,300,400};
        int k = 2;

        int sum = 0 , max =0;
        for(int i = 0; i < k; i++){
            sum += arr[i];
        }
        max = sum;
        int j = k;
        while(j < arr.length){
           sum += arr[j];
           sum -= arr[j-k];
           max = Math.max(max,sum);
              j++;
        }
        System.out.println(max);
    }
}