import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main21 {
    static void main() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Azat", 90);
        map.put("Aida", 80);
        map.put("Bob",90);
        map.put("Adilet",80);
        map.put("Beka",70);
        System.out.println(map);
        Map<Integer, List<String>> map2 = new HashMap<>();
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            map2.computeIfAbsent(entry.getValue(), k -> new ArrayList<>()).add(entry.getKey());
        }
        System.out.println(map2);
    }

}
