import java.util.HashMap;
import java.util.Map;

public class Day1_0137 {
    public int singleNumber_HashMap(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int current : nums) {
            map.put(current, map.getOrDefault(current, 0) + 1); // Store all the values in HashMap with frequency
        }
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return 0;
    }
}  
