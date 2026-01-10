import java.util.Scanner;

public class ALL_Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number for Prime(Range):");
        int num = sc.nextInt();
        int num2 = sc.nextInt();
        
        int [] arr = new int[100];
        int range=rangePrime(num,num2,arr);
        
        for(int i =0 ;i<range;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static int rangePrime(int a , int b, int[] arr){
        int count =0;

      for(int i = a;i<=b;i++){
        boolean isPrime =  true;
        for(int j =2 ; j*j <= i;j++){
            if(i % j == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
          arr[count] = i;
          count++;
        }
      }
      return count;
    }

}