public class Richesh_Customer {
    public static void main(String [] args){
     int [][] accounts = {{1,2,3,4},{3,2,1,9}};
        int result = maximumWealth(accounts);  
        System.out.println(result); 

    }
  
   static int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int[] x : accounts){
            int sub_max = 0;
            for(int y : x){
               sub_max += y;
            }
            if(sub_max > max){
                max = sub_max;
            }
        }
        return max;
    
}
}
