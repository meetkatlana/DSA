
public class Second_largest_smallest {
    public static void main(String[] args) {
        int [] arr = {32,4,21,5,7,9,8};
        int  len = arr.length;
        int largest , smallest;
        for(int i = 0 ;i < len; i++){
          for(int j = 0; j < len-i-1; j++){
            if(arr[j] > arr[j+1]){
                int temp =  arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = arr[j];
            }
          }
        }
      if(len < 2){
        System.out.println("Array does not have second largest and smallest elements.");
      } else {
        System.out.println("The second largest element in the array is: " + arr[len-2]);
        System.out.println("The second smallest element in the array is: " + arr[1]);
      }
    }
}