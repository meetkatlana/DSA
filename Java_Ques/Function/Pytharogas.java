import java.util.Scanner;

public class Pytharogas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first side:");
        int a = sc.nextInt();
        System.out.println("Enter second side:");
        int b = sc.nextInt();
        System.out.println("Enter third side:");
        int c = sc.nextInt();

        check(a,b,c);
    }
    static void check(int x , int y, int z){
        int sq_x = x*x;
        int sq_y = y*y;
        int sq_z = z*z;

        if(sq_x + sq_y == sq_z ||
            sq_x + sq_z == sq_y ||
            sq_y + sq_z == sq_x){
                System.out.println("Pythagorean Triplet");
            }
            else{
                System.out.println("Not a Pythagorean Triplet");
            }
    }
}