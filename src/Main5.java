import java.util.HashSet;

public class Main5 {

    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        HashSet<Integer> set2 = new HashSet<>();
        set.add(1);set.add(2);set.add(34);set.add(3);
        set2.addAll(set);

        System.out.println(set2);

    }

}
