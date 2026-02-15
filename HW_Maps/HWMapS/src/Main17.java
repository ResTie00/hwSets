import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main17 {
    static void main() {
        ArrayList<String> list = new ArrayList<>();
        list.add("banana");
        list.add("apple");
        list.add("orange");
        list.add("pear");
        list.add("banana");
        Map<String,Integer> map = new HashMap<>();
        for(String e : list){
            map.put(e,map.getOrDefault(e,0)+1);
        }
        System.out.println(map);
        for(Map.Entry<String,Integer> e : map.entrySet()){
            if(e.getValue()>1){
                System.out.println(e.getKey()+" "+e.getValue() + " is not unique");
            }else System.out.println(e.getKey()+" "+e.getValue() + " is unique");
        }
    }
}
