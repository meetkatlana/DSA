import java.util.Scanner;
public class Perfect_No {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int num = sc.nextInt();
        int sum = 0 , temp = num;
        for(int i = 1 ; i < temp ; i++){
            int sub = temp % i;
            if(sub == 0 ){
                sum += i;
            }
        }
        if(sum == num){
            System.out.println(num+" is a Perfect Number");
        }
        else{
            System.out.println(num+" is not a Perfect Number");
        }

    }
}