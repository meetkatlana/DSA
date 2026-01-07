import java.util.Scanner;

public class Distance_btn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First coordinates :");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.println("Enter Second coordinates :");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        int X = (x2-x1);
        int Y = (y2-y1);

        double  tempx = Math.pow((X),2);
        double  tempy = Math.pow((Y) , 2);
        double distance = Math.pow((tempx + tempy), 0.5);
        System.out.println("Distance Btn x2 - x1 :"+(tempx));
        System.out.println("Distance Btn y2 - y1 :"+(tempy));
        System.out.println("Distance Btn X & Y :"+(distance));

    }
}