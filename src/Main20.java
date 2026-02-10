import java.util.ArrayDeque;

import java.util.Arrays;

import java.util.Deque;

public class Main20 {

    public static void main(String[] args) {
        String s =  "adiida";
        String[] strings = s.split("");
        Deque<String> name = new ArrayDeque<>(Arrays.asList(strings));
        boolean poli = false;
        for (int i=0; i < name.size(); i++) {
            if(name.peekFirst().equals(name.peekLast())){
                poli = true;
            }

        }
        System.out.println(poli);
    }
}