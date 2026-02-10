import java.util.ArrayDeque;

import java.util.Deque;

public class Main15 {

    public static void main(String[] args) {

        Deque<Integer> integers = new ArrayDeque<>();

        Deque<Integer> integers1 = new ArrayDeque<>();
        integers.add(1);
        integers.add(12);
        integers.add(13);
        integers.add(14);
        integers.add(15);
        System.out.println(integers.peek());
        System.out.println(integers.peekFirst());
        System.out.println(integers.peekLast());
        System.out.println(integers1.peekLast());
        System.out.println(integers1.peekFirst());
        System.out.println(integers1.peek());
    }
}