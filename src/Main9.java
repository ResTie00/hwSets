import java.util.Arrays;

import java.util.HashSet;

public class Main9 {

    public static void main(String[] args) {

        String sent = "Sent Sent is sent";

        String[] sent1 = sent.split(" ");

        HashSet<String> set = new HashSet<>(Arrays.asList(sent1));

        System.out.println(set);

    }
}