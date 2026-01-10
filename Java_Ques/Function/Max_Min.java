import java.util.Scanner;
public class Max_Min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter First Number:");
       int num1 = sc.nextInt();
       System.out.println("Enter Second Number:");
       int num2 = sc.nextInt();
       System.out.println("Enter Third Number:");
       int num3 = sc.nextInt();
      
       int maximum = max(num1 , num2 , num3);
       int minimum = min(num1 , num2 , num3);

       System.out.println("Maximum Number is: " + maximum);
         System.out.println("Minimum Number is: " + minimum);

    }
    static int max(int x ,int y ,int z){
        if(x > y && x > z){
            return x;
        }else if( y > z){
            return y;
        }
        else{
            return z;
        }
    }
    static int min(int x ,int y ,int z){
        if(x < y && x < z){
            return x;
        }else if( y < z){
            return y;
        }
        else{
            return z;
        }
    }

}