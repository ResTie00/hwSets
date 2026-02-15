import java.util.HashMap;
import java.util.Map;

public class Main5 {
    static void main() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Azat", 90);
        map.put("Aida", 80);
        map.put("John",70);
        System.out.println(map);
        System.out.println(map.isEmpty());
        map.clear();
        System.out.println(map.isEmpty());
        System.out.println(map);
        map.put("Smith", 12);
        map.put("ASdada", 231);
        System.out.println(map);

    }
}
