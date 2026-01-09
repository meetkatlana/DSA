import java.util.Scanner;
public class Back_Triangle_rev_Alph{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of rows:");
        int rows = sc.nextInt();

        for(int i = 1 ;i<= rows; i++){
            for(int j = 1 ; j <= i; j++){
                System.out.print((char)(65+rows-j)+" ");
            }
            System.out.println("\n");
        }
    }
}