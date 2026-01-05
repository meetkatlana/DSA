import java.util.Scanner;
public class Amstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Num for Armstrong Check :");
        int num = sc.nextInt();

        System.out.println("Enter Num 2 for Armstrong Check :");
        int num2 = sc.nextInt();
       
        int temp = num , temp2 = num2;
        int check1 = 0 , check2 = 0;
        while(temp>0){
            int rem = temp % 10;
            int rem2 = temp2 % 10;
            
            check1 = check1 +(rem*rem*rem);
            check2 = check2 +(rem2*rem2*rem2);

            temp =temp / 10;
            temp2 = temp2 / 10;
        }
        if(check1 == num && check2 == num2){
            System.out.println("Both are Armstrong ");
        }
        else if(check1 == num){
            System.out.println(num + " is Armstrong ");
        }
        else if(check2 == num2){
            System.out.println( num2 + " is Armstrong ");
        }
        else{
            System.out.println("Both are Not Armstrong ");
        }

    }
}
