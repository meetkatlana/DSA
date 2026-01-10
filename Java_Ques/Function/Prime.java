import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = sc.nextInt();

        prime(num);
    }
    static void prime(int x){
        boolean isPrime = true;

        for(int i = 2 ; i<= x; i++){
            if(x % i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println(" Not Prime Number");
        }
        else{
            System.out.println(" Prime Number");
        }
    }
}