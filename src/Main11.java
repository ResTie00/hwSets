import java.util.ArrayDeque;
import java.util.Deque;
public class Main11 {

    public static void main(String[] args) {

        Deque<Integer> name = new ArrayDeque<>();

        name.offer(1);

        name.offer(2);

        name.offer(3);

        System.out.println(name.peek());

        while (!name.isEmpty()) {

            System.out.println(name.poll());

        }
    }
}