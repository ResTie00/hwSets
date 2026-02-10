import java.util.Stack;

public class Main12 {

    public static void main(String[] args) {
        Stack<String> strings = new Stack<>();
        strings.push("item");
        strings.push("item1");
        strings.push("item2");
        strings.push("item3");
        System.out.println(strings);
        while (!strings.isEmpty()) {

            System.out.println(strings.pop());

        }

        System.out.println(strings);

    }
}