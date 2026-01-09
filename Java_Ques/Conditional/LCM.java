import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int  num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int  num2 = sc.nextInt();
         int hcf = findhcf(num1 , num2);
        int lcm = (num1 * num2) /hcf;
        System.out.println("LCM : "+lcm);
    } 

    static int findhcf(int a , int b){
          while( b != 0){
             int rem = a %b ;
             a = b;
             b = rem;
          }
          return a;
    }
}