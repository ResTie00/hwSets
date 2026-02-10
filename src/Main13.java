import java.util.ArrayDeque;

import java.util.Deque;

public class Main13 {

    public static void main(String[] args) {
        Deque<Integer> integers = new ArrayDeque<>();
        integers.addFirst(1);
        integers.addLast(12);
        integers.addFirst(2112);
        integers.addLast(123);
        System.out.println(integers);

    }

}
