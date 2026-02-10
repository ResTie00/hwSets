import java.util.HashSet;
public class Main2 {
        public static boolean isExist(HashSet<String> mem, String name){
        if(mem.contains(name)){
            return true;
        }
        return false;
        }

public static void main(String[] args) {
    HashSet<String> mem =  new HashSet<>();
    mem.add("John");
    mem.add("John1");
    mem.add("John2");
    mem.add("John3");

    System.out.println(isExist(mem, "John"));

    System.out.println(isExist(mem,  "sss"));

}

}