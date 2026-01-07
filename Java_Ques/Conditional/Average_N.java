import java.util.Scanner;

public class Average_N {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Number:");
    int  num = sc.nextInt();
    int sum = 0;
    for(int i = num ; i>0 ;i--){
        sum += i;
    }
    System.out.println("Sum of N :"+sum);
    System.out.println("Average of N :"+(sum/num));
}
}
