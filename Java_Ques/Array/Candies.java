import java.util.ArrayList;
import java.util.List;

public class Candies {
    public static void main(String[] args) {
        int [] candies = {2,5,3,1,4};
        int extraCandies = 3;

        Candies obj = new Candies();
        List<Boolean> result = obj.kidsWithCandies(candies, extraCandies);

        System.out.println(result);
        
    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
         List<Boolean> ans = new ArrayList<>();
        int max = candies[0];
        for(int i = 1 ; i < candies.length; i++){
            if(max < candies[i]){
                max = candies[i];
            }
        }
        for(int i = 0; i < candies.length; i++){
             if((candies[i] + extraCandies) >= max){
                ans.add(true);
             }
             else{
                 ans.add(false);
             }
        }
        return ans;
    }
}
