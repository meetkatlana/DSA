import java.util.Scanner;

public class Input_till_Print_Largest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int max = 0;
        while(true){
            System.out.println("Enter : ");
            int num = sc.nextInt();
            if(max<num) max = num;
            if(num == 0){
                 System.out.println("Largest : "+max);
                break;
            }
        }
    }
}
