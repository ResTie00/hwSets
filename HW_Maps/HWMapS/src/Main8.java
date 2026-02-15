import java.util.HashMap;
import java.util.Map;

public class Main8 {
    static void main() {
        Map<String, Integer>map = new HashMap<>();
        map.put("Azat", 90);
        map.put("Aida", 80);
        map.put("John",70);
        map.replace("Aida",80, 123);
        map.replace("Azat",99);
        System.out.println(map);
        System.out.println(map.replace("Mira",80, 123));
        System.out.println(map);
    }
}
