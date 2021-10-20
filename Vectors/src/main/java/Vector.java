import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Scanner;
public class Vector
{
    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z){
        this.setX(x);
        this.setY(y);
        this.setZ(z);
    }
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public int hashCode(){
        int result = 17;
        long x = Double.doubleToLongBits(this.x);
        long y = Double.doubleToLongBits(this.y);
        long z = Double.doubleToLongBits(this.z);
        result = 37 * result + (int)(x ^ (x >>> (int)(Math.random() * 33))) + (int)(y ^(y >>> (int)(Math.random() * 33))) + (int)(z ^ (z >>> (int)(Math.random() * 33)));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Vector vector = (Vector)obj;
        if (vector.getX() == getX() && vector.getY() == getY() && vector.getZ() == getZ()){
            return true;
        } else {
            return false;
        }
    }
    @Override
    public String toString(){
        return ("( " + getX() + ", " + getY() + ", " + getZ() + " )");
    }

    // Длина вектора. Корень из суммы квадратов
    double length(){
        double x = getX();
        double y = getY();
        double z = getZ();
        return Math.sqrt(x * x + y * y + z * z);
    }

    // метод, вычисляющий скалярное произведение
    double scalarProduct(Vector vector){
        double x2 = vector.getX();
        double y2 = vector.getY();
        double z2 = vector.getZ();
        return (getX() * x2 + getY() * y2 + getZ() * z2);
    }

    // метод, вычисляющий векторное произведение
    Vector crossProduct(Vector vector){
        double x2 = vector.getX();
        double y2 = vector.getY();
        double z2 = vector.getZ();
        double x3 = getY() * z2 - getZ() * y2;
        double y3 = getZ() * x2 - getX() * z2;
        double z3 = getX() * y2 - getY() * x2;
        Vector vector3 = new Vector(x3, y3, z3);
        return vector3;

    }

    // Косинус между двумя векторами
    double cos(Vector vector){
        double skalarMultiplication = scalarProduct(vector);
        double len = length() * vector.length();
        return skalarMultiplication/len;
    }

    // Сумма двух векторов
    Vector add(Vector vector){
        double x3 = getX() + vector.getX();
        double y3 = getY() + vector.getY();
        double z3 = getZ() + vector.getZ();
        Vector vector3 = new Vector(x3, y3, z3);
        return vector3;
    }

    // Разность двух веторов
    Vector subtract(Vector vector){
        double x3 = getX() - vector.getX();
        double y3 = getY() - vector.getY();
        double z3 = getZ() - vector.getZ();
        Vector vector3 = new Vector(x3, y3, z3);
        return vector3;
    }
}
