import java.util.HashMap;
import java.util.Map;

public class Main4 {
    static void main() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Azat", 90);
        map.put("Aida", 80);
        map.put("John",70);
        System.out.println(map);
        map.remove("Azat");
        System.out.println(map);
        System.out.println(map.remove("ASsdad"));
        System.out.println(map);
    }
}
