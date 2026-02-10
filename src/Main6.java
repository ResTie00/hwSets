import java.util.HashSet;

public class Main6 {

    public static void main(String[] args) {

        HashSet<Integer> integers = new HashSet<>();

        HashSet<Integer> integers1 = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            integers.add(i);
        }
        for (int i = 0; i < 5; i++) {
            integers1.add(i);
        }



        integers.removeAll(integers1);

        System.out.println(integers);

    }
}