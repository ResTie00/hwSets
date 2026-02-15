import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main19 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Azat", 90);
        map.put("Aida", 80);
        map.put("John", 70);
        map.put("Bob", 59);
        map.put("Idiot", 20);
        Iterator<Integer> iterator = map.values().iterator();
        while(iterator.hasNext()){
            Integer value = iterator.next();
            if(value < 60){
                iterator.remove();
            }
        }
        System.out.println(map);
    }
}
