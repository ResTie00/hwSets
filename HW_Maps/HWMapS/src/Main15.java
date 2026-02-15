import java.util.HashMap;
import java.util.Map;

public class Main15 {
    static void main() {
        String s = "swwiiss";
        String[] strings =  s.split("");
        Map<String,Integer> map = new HashMap<>();
        for(String string : strings){
            map.put(string, map.getOrDefault(string,0)+1);
        }
        boolean found = false;
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                System.out.println(entry.getKey()+"="+entry.getValue());
                found = true;
            }
            if (found == true){
                return;
            }
        }
        if(found == false){
            System.out.println("Couldn't find");
        }

    }
}
