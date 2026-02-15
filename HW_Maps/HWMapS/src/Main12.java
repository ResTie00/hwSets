import java.util.HashMap;
import java.util.Map;

public class Main12 {
    static void main() {
        String s = "Java is fun and java is powerful and fun";
        s = s.toLowerCase();
        String[] strings =  s.split("");
        Map<String,Integer> map = new HashMap<>();
        for(String string : strings){
            map.put(string,map.getOrDefault(string,0)+1);
        }
        System.out.println(map);
    }
}
