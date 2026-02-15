import java.util.HashMap;
import java.util.Map;

public class Main18 {
    static void main() {
        Map<String,Integer> map = new HashMap<>();
        Map<String,Integer> map2 = new HashMap<>();
        map.put("A",1);map.put("B",2);map.put("C",3);
        map2.put("C",3);map2.put("A",1);map2.put("B",2);
        System.out.println(map.equals(map2));
        System.out.println(map.hashCode() == map2.hashCode());
        System.out.println(map.hashCode());
        System.out.println(map2.hashCode());
    }
}
