import java.util.HashSet;

public class Main7 {
    public static void main(String[] args) {
        HashSet<Integer> name = new HashSet<>();
        HashSet<Integer> name1 = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            name.add(i);
        }
        for (int i = 0; i < 5; i++) {
            name1.add(i);
        }
        name.retainAll(name1);

        System.out.println(name);

    }

}
