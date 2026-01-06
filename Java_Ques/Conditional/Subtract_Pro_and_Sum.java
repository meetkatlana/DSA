
import java.util.Scanner;

public class Subtract_Pro_and_Sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value");
        int n = sc.nextInt();
        int temp = n,temp_sub = n;
        int product = 1 , sum = 0;

        while(temp>0){
            int sub = temp%10;
             product = product * sub;
             temp = temp/10;
        }
        while(temp_sub>0){
            int sub = temp_sub %10;
            sum = sum + sub;
            temp_sub = temp_sub/10;
        }
        System.out.println("Output : "+(product - sum));
    }
}
