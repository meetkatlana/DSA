import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int  num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int  num2 = sc.nextInt();

        int [] arr1 = new int[num1];
        int [] arr2 = new int[num2];
       int c1 = hcf(num1,arr1);
        int c2 = hcf(num2,arr2);
        
        int hcf = 1;
        for(int i = 0; i<c2;i++){
           for(int j =0 ;j<c1 ;j++){
              if(arr1[j]==arr2[i] && arr1[j]>hcf){
                hcf = arr1[j];
              }
           }
        }
        System.out.println("HCF : "+hcf);

    }
    static int hcf(int n , int  arr[]){
        int count = 0;
       for(int i = 1 ;i <= n;i++){
            if(n % i == 0){
                arr[count] = i;
            count++;
             }
         }
         return count;   
    }
}
// Approach 2 :
// import java.util.Scanner;

// public class HCF {

//     static int hcf(int a, int b) {
//         while (b != 0) {
//             int rem = a % b;
//             a = b;
//             b = rem;
//         }
//         return a;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter first number: ");
//         int num1 = sc.nextInt();

//         System.out.print("Enter second number: ");
//         int num2 = sc.nextInt();

//         int result = hcf(num1, num2);
//         System.out.println("HCF: " + result);
//     }
// }

