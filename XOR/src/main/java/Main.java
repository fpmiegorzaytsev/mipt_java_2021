
public class Main {
    public static void main(String[] args) {
        Set<Object> set1 = new Set<>();
        Set<Object> set2 = new Set<>();
        set2.add("hello");
        set2.add(1);
        set2.add(true);
        set1.add("hello");
        set1.add(25);
        System.out.println(Set.symmetricDifference(set1, set2));
    }
}
