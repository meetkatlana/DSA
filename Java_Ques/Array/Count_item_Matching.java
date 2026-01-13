import java.util.Arrays;
import java.util.List;

public class Count_item_Matching {
    public static void main(String[] args) {
        List<List<String>> items = Arrays.asList(
            Arrays.asList("phone", "blue", "pixel"),
            Arrays.asList("computer", "silver", "lenovo"),
            Arrays.asList("phone", "gold", "iphone")
        );
        String ruleKey = "color", ruleValue = "silver";
        int ans = countMatches(items, ruleKey, ruleValue);
        System.out.println(ans);
    }
 
    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
       int index =-1 , count = 0;
       switch(ruleKey){
        case "type" -> index = 0;
        case "color" -> index = 1;
        default -> index =2;
       }
        for(List<String> x : items){
            if(x.get(index).equals(ruleValue)){
                count +=1;
            }
        }
        return count;
    }
}