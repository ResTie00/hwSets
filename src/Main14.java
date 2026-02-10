import java.util.ArrayDeque;
import java.util.Deque;

public class Main14 {
    public static void main(String[] args) {
        Deque<Integer> integers = new ArrayDeque<>();
        System.out.println(integers.offerFirst(1));
        System.out.println(integers.offerFirst(1));
        System.out.println(integers.offerLast(12));
        System.out.println(integers);
    }
}
