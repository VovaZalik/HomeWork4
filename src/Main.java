import java.util.HashMap;
import java.util.Map;

public class Main {
    public static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
    public static void main(String[] args) {

        char [] elements = text.toLowerCase().toCharArray();

        Map<Character, Integer> map = new HashMap<>();

        elementsCounter(elements, map);
        System.out.println(map);
        System.out.println(maxSymbol(map));
        System.out.println(minSymbol(map));
    }

    private static void elementsCounter(char[] elements, Map<Character, Integer> map) {
        for (int i = 0; i < elements.length; i++) {
            if (Character.isLetter(elements[i])) {
                Integer count = map.get(elements[i]);
                if (count == null) {
                    map.put(elements[i], 1);
                } else {
                    count++;
                    map.put(elements[i], count);
                }
            }
        }
    }

    private static int maxSymbol(Map<Character, Integer> map) {
        int max = Integer.MIN_VALUE;
        for (Map.Entry<Character, Integer> symbol : map.entrySet()) {
            if (symbol.getValue() > max) {
                max = symbol.getValue();
            }
        }
        return max;
    }
    private static int minSymbol(Map<Character, Integer> map) {
        int min = Integer.MAX_VALUE;
        for (Map.Entry<Character, Integer> symbol : map.entrySet()) {
            if (symbol.getValue() < min) {
                min = symbol.getValue();
            }
        }
        return min;
    }
}
