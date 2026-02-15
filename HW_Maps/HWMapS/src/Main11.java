import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main11
{
    static void main()
    {
        Map<String, Integer> map = new HashMap<>();
        map.put("Azat", 90);
        map.put("Aida", 80);
        map.put("John",70);
        int max = Collections.max(map.values());
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            if(entry.getValue()==max){
                System.out.println(entry.getKey()+"="+entry.getValue());
            }
        }
    }
}
