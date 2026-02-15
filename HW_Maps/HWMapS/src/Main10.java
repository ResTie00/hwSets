import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main10 {
    static void main() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Azat", 90);
        map.put("Aida", 80);
        map.put("John",70);
        Iterator<Integer> it = map.values().iterator();
        int count = 0;
        while(it.hasNext()){
            int a = it.next();
            if(a<80){
                it.remove();
            }else count++;

        }
        System.out.println(map);
        System.out.println(count);
    }
}
