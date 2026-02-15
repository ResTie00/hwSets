import java.util.*;

public class Main22 {
    static void main() {
        String s = "Java is fun and Java is powerful and fun";
        s = s.toLowerCase();
        Map<String, Integer> map = new HashMap<>();
        String[] words = s.split("");
        for(String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        int max1 = Collections.max(map.values());
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue() == max1) {
                System.out.println("First max: "+entry.getKey()+" = "+entry.getValue());
            }
        }
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            if(entry.getValue() == max1) {
                iterator.remove();
            }
        }
        int max2 = Collections.max(map.values());
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue() == max2) {
                System.out.println("Second max: "+entry.getKey()+" = "+entry.getValue());
            }
        }
    }

}
