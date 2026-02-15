import java.util.HashMap;
import java.util.Map;

public class Main7 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Azat", 90);
        map.put("Aida", 80);
        map.put("John", 70);
        map.putIfAbsent("Aida", 90);
        System.out.println(map);
        map.putIfAbsent("Mira", 70);
        System.out.println(map);
        // We have already key named Aida so when code finds it out it will just ignore put if absent
    }
}
