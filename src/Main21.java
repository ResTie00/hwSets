import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main21 {

    public static void addTask(String task, boolean highPriority, Deque<String> deque) {
        if (highPriority) {
            deque.addFirst(task);
        } else deque.addLast(task);
        System.out.println(deque);
    }


    public static void processTask(Deque<String> deque) {
        deque.removeFirst();
        System.out.println(deque);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<String> deque = new ArrayDeque();
        while (true) {
            System.out.println("What you want?");
            System.out.println("1 - add task");
            System.out.println("2 - process task");
            System.out.println("3 - exit");
            int act = scanner.nextInt();
            if (act == 3) {
                break;
            } else if (act == 1) {
                System.out.println("Write a task");
                String task = scanner.next();
                System.out.println("Write a priority");
                boolean highPriority = scanner.nextBoolean();
                addTask(task, highPriority, deque);
            } else if (act == 2) {
                processTask(deque);
            }
        }
    }
}

