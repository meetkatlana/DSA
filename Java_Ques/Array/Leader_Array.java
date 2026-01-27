
public class Leader_Array {
    public static void main(String[] args) {
        int [] arr = {10, 22, 12, 3, 0, 6};

       System.out.println("Leader Elements in the Array are:");
        for(int i = 0; i < arr.length; i++){
            boolean isleader = true;
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] < arr[j]){
                    isleader = false;
                    break;
                }
            }
            if(isleader){
               System.out.println(arr[i]+" ");
            }
        }
       
       
    }
}