
public class Union {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8};
        int [] arr2 = {2,3,4,4,5,9,10};
        int n = arr.length;
        int m = arr2.length;

        int [] common = new int[n];
        int [] dist1 = new int[n];
        int [] dist2 = new int[n];
        
        int [] union= new int[(n + m)];

        for(int i = 0; i < n;i++){
            boolean visited = false;
            for(int j = 0; j < m; j++){
               if(arr[i] == arr2[j]){
                if(!visited){
                    common[i] = arr[i];
                    visited = true;
                }
               }
            }
            if(arr[i] != common[i]){
                dist1[i] = arr[i];
            }
        }
        for(int i = 0; i < m; i++){
            boolean visited = false;
            for(int j = 0; j < n; j++){
               if(arr2[i] == arr[j]){
                visited = true;
               }
            }
            if(!visited){
                dist2[i] = arr2[i];
            }
        }
        // for(int i = 0; i < common.length; i++){
        //     if(common[i] != 0){
        //         System.out.print(common[i]+" ");
        //     }
        // }
        // System.out.println(" ");
        // for(int i = 0; i < dist1.length; i++){
        //     if(dist1[i] != 0){
        //         System.out.print(dist1[i]+" ");
        //     }
        // }
        //    System.out.println(" ");
        // for(int i = 0; i < dist2.length; i++){
        //     if(dist2[i] != 0){
        //         System.out.print(dist2[i]+" ");
        //     }
        // }

        for(int i = 0; i < union.length; i++){
            if(common.length > i){
            union[(common[i])-1] = common[i];
            }
            if(dist1.length > i){
              union[(dist1[i])-1] = dist1[i];
            }
            if(dist2.length > i){
                union[(dist2[i])-1] = dist2[i];
        }
    }
        for(int i = 0; i < union.length; i++){
            if(union[i] != 0){
                System.out.print(union[i]+" ");
            }
        }
    }
}