import java.util.Scanner;

public class prt {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal Amount :");
        int p = sc.nextInt();
        System.out.println("Enter Rate of Interest :");
        float r = sc.nextFloat();
        System.out.println("Enter Time Period :");
        int t = sc.nextInt();
        float total ;
        total = (p*r*t)/100;
        System.out.println("The Simple Interest is :"+ total);
    }
}
