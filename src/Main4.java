import java.util.HashSet;

public class Main4 {

    public static void main(String[] args) {

        HashSet<String> name1 = new HashSet<>();

        name1.add("John");


        name1.add("John2");

        name1.add("John1");

        name1.add("John3");

        name1.add("John4");

        name1.add("John5");

        name1.remove("John");

        if (!name1.contains("John")) {
            System.out.println("Removed");
        } else System.out.println("Not removed");

        System.out.println(name1);
    }
}