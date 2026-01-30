
public class String_palindrome {
    public static void main(String[] args) {
        
    }
 
    public boolean isPalindrome(String s) {
        int i = 0 , j = s.length() -1 ;
        s = s.toLowerCase();
        while(i < j){
            char ch = s.charAt(i);
            char ch2 = s.charAt(j);
            if(!Character.isLetterOrDigit(ch)){
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(ch2)){
                j--;
                continue;
            }
            if(ch != ch2){
                return false;
            }
            i++;
            j--;
        }

       return true;

    
}
}