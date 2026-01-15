
public class Diagonal_Sum {
    public static void main(String[] args) {
        
    }

    public int diagonalSum(int[][] mat) {
        int res = 0;
        int size = mat.length;
        for(int i = 0;i < size; i++){
            res += mat[i][i];
            res += mat[size-1-i][i];
        }
        if(size % 2 != 0){
            res -= mat[size/2][size/2];
        }
        return res;
    }
}
