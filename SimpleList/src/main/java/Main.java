import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyArrayList array = new MyArrayList(3);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        System.out.println(array.size());
        System.out.println(array.get(2));
        System.out.println(array.remove(3));
        System.out.println(array.size());
    }
}
