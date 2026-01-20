
public class Odd_cell {
    public static void main(String[] args) {
        
    }

    static int oddCells(int m, int n, int[][] indices) {
       int [] rows = new int[m];
       int [] col = new int[n];
       int odd = 0;
       for(int [] arr : indices){
        rows[arr[0]]++;
        col[arr[1]]++;
       }
      for(int i = 0; i < m; i++){
        for(int j = 0; j < n; j++){
        if((rows[i] + col[j] ) % 2 != 0)
            odd++;
      } 
    }
      return odd;
    }
}
