import java.util.Scanner;
public class Star{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of rows:");
        int rows = sc.nextInt();

        for(int i = 1 ;i<= rows; i++){
            for(int space = rows-i; space >=1; space--){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= i; j++){
                System.out.print("*");
            }
            for(int extra = i-1 ; extra >=1; extra--){
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
}