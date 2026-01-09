import java.util.Scanner;
public class Triangle_Alph_seq{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of rows:");
        int rows = sc.nextInt();

        for(int i = 1 ;i<= rows; i++){
            for(int j = 1 ; j <= i; j++){
                System.out.print((char)(65+i-1)+" ");
            }
            System.out.println("\n");
        }
    }
}