import java.util.Scanner;
public class Palindrom {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = sc.nextLine();
        String temp = str;
        
        int len = str.length();
        String rev = "";
        while(len>0){
            rev = rev + str.charAt(len-1);
            len--;
           
        }
        if(str.equals(rev)){
                System.out.println("The Given String is Palindrom");
            
            }
            else{
                System.out.println("The Given String is Not Palindrom");
            }

    }
}
