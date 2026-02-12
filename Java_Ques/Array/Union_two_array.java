import java.util.HashSet;
import java.util.Set;

public class Union_two_array {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5,6,8,9,10};
        int [] arr2 = {2,3,4,4,5,6,7,8,11,12};
        int n = 5 , m = 5;

        Set<Integer> set = new HashSet<>();
        for(int num : arr1){
            set.add(num);
        }
        for(int num : arr2){
            set.add(num);
        }
        System.out.println(set);
    }
}