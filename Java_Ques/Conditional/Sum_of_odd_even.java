import java.util.Scanner;

public class Sum_of_odd_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Sum_negative = 0 , Sum_odd = 0 ,Sum_even = 0;

        System.out.println("Enter a Number :");
        while(true){
            int num = sc.nextInt();
            if(num == 0){
                break;
            }
             if(num < 0){
                Sum_negative += num;
             }
             else if(num %2 == 0){
                Sum_even += num;
             }
             else{
                Sum_odd += num;
             }
        }
        System.out.println("Sum of Negative Number : "+Sum_negative);
        System.out.println("Sum of Odd Number : "+Sum_odd);
        System.out.println("Sum of Even Number : "+Sum_even);
    }
}