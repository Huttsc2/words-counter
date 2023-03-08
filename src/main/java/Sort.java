import java.util.HashMap;
import java.util.Map;

public class Sort {
    public static void main(String[] args) {
        StringBuilder mapAsString = new StringBuilder();
        HashMap<String, Integer> map = new HashMap<>();
        map.put("qwe", 10);
        map.put("qww", 30);
        map.put("wdd", 50);
        map.put("asd", 40);
        map.put("ass", 10);
        map.put("zxc", 60);
        map.put("xxx", 110);

        map.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(v->mapAsString.append(v).append("\n"));

        System.out.println(mapAsString);
    }
}
