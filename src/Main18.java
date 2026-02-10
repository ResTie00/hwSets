import java.util.ArrayDeque;

import java.util.Deque;

public class Main18 {

    public static void main(String[] args) {
        Deque<Integer> integers = new ArrayDeque<>();
        integers.add(1);
        System.out.println(integers.size());
        integers.remove();
        System.out.println(integers.isEmpty());
        integers.add(1);
        integers.add(1);
        integers.add(1);
        System.out.println(integers.size());
        integers.remove();
        System.out.println(integers.isEmpty());

    }

}
