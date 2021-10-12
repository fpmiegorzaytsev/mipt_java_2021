import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> pair = Pair.of(1, null);
        Integer i = pair.getFirst(); // 1
        String s = pair.getSecond(); // "hello"
        Pair<Integer, String> pair2 = Pair.of(1, null);
        boolean mustBeTrue = pair.equals(pair2); // true!
        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode();
        System.out.println(i + " " + s + " " + mustBeTrue + " " + mustAlsoBeTrue);
        System.out.println(pair.toString());
    }
}
