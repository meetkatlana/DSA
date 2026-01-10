import java.util.Scanner;
public class Number_Crown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of rows:");
        int rows = sc.nextInt();
        
        int count = 0;
        if(rows%2==0) count = rows +2;
        else count = rows +1;
        for(int i = 1 ;i<= rows; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            for(int space = count ; space >= 1; space--) {
                System.out.print("_");
            }
            count = count - 2;
            int temp = i;
            for(int k = 1; k <= i; k++){
                System.out.print(temp--);
            }
            System.out.println("\n");
        }

    }
}