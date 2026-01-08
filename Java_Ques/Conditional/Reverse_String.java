
public class Reverse_String {
    public static void main(String[] args) {
        String str = "Meet katlana";
        String rev = "";
        int len = str.length();
        System.out.println("Main String : "+str);

        for(int i = len-1 ; i >= 0 ; i--)
       { 
        rev = rev +str.charAt(i);
       }
       System.out.println("Reverse String : "+rev);
    }
}

 