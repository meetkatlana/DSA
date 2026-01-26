
public class Largest_Element {
    public static void main(String[] args) {
        int [] arr = {3,2,5,7,4,12,8,1};
        int len = arr.length;
        int largest = arr[0];
        for(int i = 1; i< len; i++){
        if(arr[i] > largest){
            largest = arr[i];
        }
    }
        System.out.println("The largest element in the array is: " + largest);
    }
}