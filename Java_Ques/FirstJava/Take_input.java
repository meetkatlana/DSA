package Java_Ques.FirstJava;
import java.util.Scanner;
public class Take_input {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Name :");
    String str = sc.nextLine();
    System.out.println("Hello, How are you ?? " + str);
}
}