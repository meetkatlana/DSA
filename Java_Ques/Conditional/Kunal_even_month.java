
public class Kunal_even_month {
    public static void main(String[] args) {

        int month = 31;
        int Number_of_Days = 0;
        int count = 0;
        for( int i = 1 ;i <= month ; i++){
            int temp = i % 2;
            if(temp == 0){
                Number_of_Days++;
            }
        }
        System.out.println("Number of days Kunal Play in month: " + Number_of_Days);
    }
}