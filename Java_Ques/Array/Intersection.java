import java.util.Arrays;
import java.util.HashSet;

public class Intersection {
    public static void main(String[] args) {
        
    }
     public int[] intersection(int[] nums1, int[] nums2) {
       int [] arr = new int[nums2.length];
        HashSet<Integer> hs = new HashSet<>();
        for(int x : nums1){
            hs.add(x);
        }
        int count = 0;
        for(int x : nums2){
            if(hs.contains(x)){
                arr[count] = x;
                hs.remove(x);
                count++;
            }
            
        }
        
        return Arrays.copyOfRange(arr, 0, count);
    }
}