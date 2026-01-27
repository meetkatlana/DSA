
public class Linear_Search {
    public static void main(String[] args) {
        int [] arr = {2,5,4,3,1,7};
        int found =  1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == found)
              System.out.println("Element Found at Index :"+i);
        }
    }
}