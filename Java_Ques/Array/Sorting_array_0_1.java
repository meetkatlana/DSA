
public class Sorting_array_0_1 {
    public static void main(String[] args) {
        int [] arr = {0,0,1,0,1,1,0,1};
        int len = arr.length;
        int left = 0 , right = len -1;
        while(left < right){
            if( arr[left] == 0){
                left++;
            }
            else if(arr[right] == 1){
                right--;
            }
            else{
              int temp = arr[left];
              arr[left] = arr[right];
              arr[right] = temp;
            }
        }
      for(int i : arr){
          System.out.print(i + " ");
     }
}
}