import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter a Year :");
        int year = Sc.nextInt();

        if( (year % 4 == 0 &&  year % 100 != 0 ) || year % 400 == 0 ){
               System.out.println(year+" is a Leap Year");
        } else{
                System.out.println(year+" is not a Leap Year");
        }    
     }
}