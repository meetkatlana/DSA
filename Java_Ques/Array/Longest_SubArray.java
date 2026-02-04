
public class Longest_SubArray {
    public static void main(String[] args) {
        int [] arr = {10, 5, 2, 7, 1, 9};
        int k = 15;
        int total = 0;
        int len = 1;
        for(int i = 0; i < arr.length; i++){
           for(int j = i+1; j < arr.length; j++){
               int count = 0;
               for(int l = i; l <= j; l++){
                    count += arr[l];     
               }
               if(count == k){
                      len = Math.max(len, j - i + 1);
                } 
            }
        }
        System.out.println("Longest Array Length : "+len);
    }
 
}