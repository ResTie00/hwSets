import java.util.ArrayDeque;
import java.util.Deque;

public class Main17 {
    public static void main(String[] args) {
        Deque<String> strings = new ArrayDeque<>();
        strings.add("a");strings.add("a");strings.add("c");strings.add("c");strings.add("d");strings.add("d");
        strings.removeFirstOccurrence("d");
        strings.removeLastOccurrence("a");
        System.out.println(strings);
    }
}
