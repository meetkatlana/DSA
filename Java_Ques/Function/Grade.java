import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks:");
        int marks = sc.nextInt();

        grade(marks);
    }
    static void grade(int marks){

    if (marks < 0 || marks > 100) {
        System.out.println("Invalid Marks");
    } else if (marks >= 90) {
        System.out.println("AA Grade");
    } else if (marks >= 80) {
        System.out.println("AB Grade");
    } else if (marks >= 70) {
        System.out.println("BB Grade");
    } else if (marks >= 60) {
        System.out.println("BC Grade");
    } else if (marks >= 50) {
        System.out.println("CC Grade");
    } else if (marks >= 40) {
        System.out.println("DD Grade");
    } else {
        System.out.println("Fail");
    }
  }

    }