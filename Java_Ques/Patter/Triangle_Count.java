import java.util.Scanner;
public class Triangle_Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of rows:");
        int rows = sc.nextInt();
        int count = 0;
        for(int i = 1 ;i<= rows; i++){
            for(int j = 1; j <= i; j++){
                count++;
                System.out.print(count+" ");
            }
            System.out.println("\n");
        }
    }
}