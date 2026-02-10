import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main10 {

    public static void main(String[] args) {


        ArrayList<String> strings = new ArrayList<>();

        strings.add("APPLE");

        strings.add("Apple");

        strings.add("apple");

        List<String> res = strings.stream().map(String::toLowerCase).toList();

        HashSet<String> result = new HashSet<>(res);

        System.out.println(result);
    }
}