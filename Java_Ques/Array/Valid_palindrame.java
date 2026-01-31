
public class Valid_palindrame {
    public static void main(String[] args) {
        
    }

     public boolean check(int i , int j , String s){
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;

    }
    public boolean validPalindrome(String s) {
        int i = 0 , j = s.length() -1;
        while(i < j){
            char ch = s.charAt(i);
            char ch2 = s.charAt(j);
            if(ch != ch2){
             return check(i+1,j,s) || check(i,j-1,s);
            }
            else{
            i++;
            j--;
           }
        }
      return true;
    }
}
