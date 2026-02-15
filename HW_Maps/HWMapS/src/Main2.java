import java.util.HashMap;
import java.util.Map;

public class Main2 {
    static void main() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Azat", 90);
        map.put("Aida", 80);
        map.put("John",70);
        System.out.println(map.get("Azat"));
        if(map.containsKey("Mira")) {
            System.out.println(map.get("Mira"));
        }else System.out.println("Couldn't find this user");
    }
}
