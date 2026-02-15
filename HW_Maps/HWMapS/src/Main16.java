import java.util.HashMap;

public class Main16 {
    static void main() {
        int[] ints = {2,7,11,15};
        int target = 9;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < ints.length; i++) {
            int component = target - ints[i];
            if(map.containsKey(component)) {
                System.out.println("Indices: "+ map.get(component)+" and "+ i);
                return;
            }
            map.put(ints[i], i);
        }
        System.out.println("Culdnt find");
    }
}
