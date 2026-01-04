import java.util.Scanner;

public class Greatest_two {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two values :");
        int num = sc.nextInt();
        int num2 = sc.nextInt();
        if(num>num2){
            System.out.println(num+" Is Greater");
        }
        else{
            System.out.println(num2+" Is Greater");
        }
    }
}
