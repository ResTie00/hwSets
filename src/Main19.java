import java.util.ArrayDeque;
import java.util.Deque;
public class Main19 {
    public static void main(String[] args) {
        Deque<Integer> integers = new ArrayDeque<>();
        for (int i = 0; i < 10; i++) {
            integers.add(i);
        }
        integers.clear();

        System.out.println(integers.peek());

        System.out.println(integers.isEmpty());

    }
}