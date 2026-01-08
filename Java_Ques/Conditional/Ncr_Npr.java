import java.util.Scanner;
public class Ncr_Npr {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter total Nnumber of items :");
        int n= sc.nextInt();
        System.out.println("Enter total number of items select :");
        int r = sc.nextInt();

        int temp = n-r;
        int Ncr =  fact(n)/(fact(r) * fact(temp));
        System.out.println("Ncr is :"+Ncr);
        int Npr = fact(n)/fact(temp);
        System.out.println("Npr is :"+Npr);

    }
    static int fact(int num){
        int  res = 1;
        for(int i=num; i> 0;i--){
           res = res * i;
        }
        return res;
    }
}
