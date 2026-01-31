
public class Valid_abr {
    public static void main(String[] args) {
        String s = "Apples";
        int i = 0;
        char first = s.charAt(i) , last = s.charAt(s.length()-1);
        int count = 0;
        while(i < s.length()-2){
          count++;
          i++;
        }
        System.out.println(" "+first+count+last);
    }
}