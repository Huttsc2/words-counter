import java.util.*;

public class SortMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 3);
        map.put("B", 6);
        map.put("C", 4);
        map.put("D", 8);
        System.out.println("unsorted map: " + map);

        ArrayList<String> list = new ArrayList<>(map.keySet());
        System.out.println(list);

        boolean is_sort = false;
        while (!is_sort) {
            is_sort = true;
            for (int i = 1; i < list.size(); i++) {
                if (map.get(list.get(i-1)) < map.get(list.get(i))) {
                    list.add(i-1, list.remove(i));
                    is_sort = false;
                    break;
                }
            }
        }
        System.out.println(list);

        for (String key : list) {
            System.out.println(key + " " + map.get(key));
        }
    }
}

