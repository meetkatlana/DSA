import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Arrayfrom {
    public static void main(String[] args) {
        
    }
    static List<Integer> addToArrayForm(int[] num, int k) {
        LinkedList<Integer> ls = new LinkedList<Integer>();
        int len = num.length - 1;
        int total = 0;
       while(len >= 0 || k != 0 || total !=0){
        if(len >= 0){
          total += num[len];
       }
       if(k > 0){
        total += k%10;
       }
           ls.addFirst(total%10);
           len--;
           total/=10;
           k/=10;
        }
        
        return ls;
    }

}