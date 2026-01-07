import java.util.Scanner;

public class Input_till_print_Sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(true){
            System.out.println("Enter : ");
            int num = sc.nextInt();
            sum += num;
            if(num == 0)break;
        }
        System.out.println("Sum : "+sum);
    }
}
