import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main13 {
    public static void main(String[] args) {
        String s = "Mississippi";
        String[] strings =  s.split("");
        Map<String,Integer> map = new HashMap<>();
        for(String string : strings){
            map.put(string,map.getOrDefault(string,0)+1);
        }
        int max = Collections.max(map.values());
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            if(entry.getValue()==max){
                System.out.println(entry.getKey()+"="+entry.getValue());
            }
        }
    }
}
