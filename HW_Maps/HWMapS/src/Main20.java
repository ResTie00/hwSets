import java.util.HashMap;
import java.util.Map;

public class Main20 {
    static void main() {
        Map<String, Integer> score = new HashMap<>();
        score.put("Aida", 40);
        score.put("Azat", 35);
        score.put("Dana", 50);
        Map<String, Integer> score2 = new HashMap<>();
        score2.put("Azat", 10);
        score2.put("Dana", 5);
        score2.put("Mira", 45);
        for (Map.Entry<String, Integer> entry : score2.entrySet()) {
            score.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }
        System.out.println(score);
    }
}
