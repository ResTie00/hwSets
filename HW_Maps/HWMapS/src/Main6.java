import java.util.HashMap;
import java.util.Map;

public class Main6 {
    static void main() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Azat", 90);
        map.put("Aida", 80);
        map.put("John",70);
        if(map.getOrDefault("Mira",-1) == -1){
            System.out.println("Can't find Mira");
        }
        if(map.getOrDefault("Smith",-1) == -1){
            System.out.println(map.get("Smith"));
        }
        System.out.println(map.getOrDefault("John",-1));
    }
}
