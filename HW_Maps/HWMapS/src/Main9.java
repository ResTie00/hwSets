import java.util.Collection;
import java.util.HashMap;

import java.util.Map;
import java.util.Set;

public class Main9 {
    static void main() {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");
        map.put(4,"D");
        Set<Integer> keys = map.keySet();
        System.out.println(keys);
        Collection<String> values = map.values();
        System.out.println(values);
        for(Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println(entry.getKey()+"="+entry.getValue()) ;
        }
    }
}
