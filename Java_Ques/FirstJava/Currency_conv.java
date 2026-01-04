import java.util.Scanner;
public class Currency_conv {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter Amount in INR :");
        float inr = sc.nextFloat();
        float usd = inr/90.0f;
        System.out.println("The Amount in USD is :"+ usd+"$");

        }
    }

