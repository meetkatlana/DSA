import java.util.Scanner;
public class Palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int num = sc.nextInt();
        int rev = 0;
        int temp = num;

        while(temp != 0){
            int sub = temp % 10;
            rev = rev*10 + sub;
            temp /=10;
        }
        if(rev == num){
            System.out.println(num+" is a Palindrom Number");
        }
        else{
            System.out.println(num+" is not a Palindrom Number");
        }
    }
}