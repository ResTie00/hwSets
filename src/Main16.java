import java.util.ArrayDeque;

import java.util.Deque;

public class Main16 {

    public static void main(String[] args) {
        Deque<Integer> integers = new ArrayDeque<>();
        for (int i = 0; i < 10; i++) {
            integers.add(i);
        }
        while (!integers.isEmpty()) {
            System.out.println(integers.pollFirst());
            System.out.println(integers.poll());
            System.out.println(integers.pollLast());
        }

    }
}