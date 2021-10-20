import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = scanner.nextDouble(), y1 = scanner.nextDouble(), z1 = scanner.nextDouble();
        Vector vector1 = new Vector(x1, y1, z1);
        double x2 = scanner.nextDouble(), y2 = scanner.nextDouble(), z2 = scanner.nextDouble();
        Vector vector2 = new Vector(x2, y2, z2);
        System.out.println("Длина первого вектора : " + vector1.length());
        System.out.println("Длина второго вектора : " + vector2.length());
        System.out.println("Скалярное произведение : " + vector1.scalarProduct(vector2));
        System.out.println("Векторное произведение первого вектора на второй : " + vector1.crossProduct(vector2));
        System.out.println("Векторное произведение второго вектора на первый : " + vector2.crossProduct(vector1));
        System.out.println("Косинус угла между векторами : " + vector1.cos(vector2));
        System.out.println("Сумма векторов : " + vector1.add(vector2));
        System.out.println("Разность первого вектора со вторым : " + vector1.subtract(vector2));
        System.out.println("Разность второго вектора с первым : " + vector2.subtract(vector1));
        System.out.println("hashCode первого вектора : " + vector1.hashCode());
        System.out.println("hashCode второго вектора : " + vector2.hashCode());
        System.out.println("Равенство векторов : " + vector1.equals(vector2));
    }
}
