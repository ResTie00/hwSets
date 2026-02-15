import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main14 {
    static void main() {
        ArrayList<String> list = new ArrayList<>();
        list.add("hi");
        list.add("java");
        list.add("sun");
        list.add("loop");
        list.add("map");
        Map<Integer,ArrayList<String>> map = new HashMap<>();
        for(String str : list){
            map.computeIfAbsent(str.length(),k -> new ArrayList<>()).add(str);
        }
        System.out.println(map);
    }
}
