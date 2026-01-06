
import java.util.Scanner;
public class Area_of_All{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Side Value");
        int side = sc.nextInt();
        System.out.println("Area of Square : "+ side*side);
        

        System.out.println("Enter Length & width");
        int len = sc.nextInt();
        int wid = sc.nextInt();
        System.out.println("Area of Rectangle : "+ len*wid);

        System.out.println("Enter Radius");
        int rad = sc.nextInt();
        System.out.println("Area of Circle : "+ (3.14*rad*rad));

        System.out.println("Enter Height & Base");
        int height = sc.nextInt();
        int base = sc.nextInt();
        System.out.println("Area of Triangle : "+ (0.5*base*height));

    }
}
