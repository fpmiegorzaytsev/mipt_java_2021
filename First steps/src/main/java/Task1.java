public class Task1
{
    //посчитать факториал числа n
    //0.5 балла - если посчитаете в цикле
    //1 балл - если посчитаете рекурсией
    public static int fact(int n){
        int p = n;
        switch(n) {
            case 1:
                return 1;
            case 0:
                return 1;
        }
        p = p * fact(n-1);
        return p;
    }

    //вывести таблицу умножения на экран - 1 балл
    //подсказка - использовать двойной for
    public static void table(){
        for(int i = 1; i <= 10; i++){
            for (int j = 0; j <= 10; j++){
                System.out.println(i + " * " + j + " = " + i*j);
            }
            System.out.println();
        }
    }

    //посчитать сумму цифр числа
    //можно посчитать для трехзначного - 0.5 балла
    //для любого числа - 1 балл
    //подсказка - в случае для любого числа используйте while
    public static int sum(int n){
        int sum = 0;
        while(n > 0) {
            sum = sum + (n%10);
            n = n/10;
        }
        return sum;
    }

    //определить, является ли год високосным
    //В високосном году - 366 дней, тогда как в обычном - 365.
    //Високосным годом является каждый четвёртый год, за исключением столетий, которые не кратны 400.
    //Так, годы 1700, 1800 и 1900 не являются високосными, так как они кратны 100 и не кратны 400.
    //Годы 1600 и 2000 - високосные, так как они кратны 100 и кратны 400.
    //Годы 2100, 2200 и 2300 - не високосные.
    //за правильный ответ - 0.5 балла
    public static boolean isLeapYear(int year) {
        if(year % 4 == 0) {
            if (year % 100 == 0) {
                if(year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    //здесь вам нужно будет использовать результат прошлой задачи
    //и вывести, сколько дней в году
    //правильный ответ - 0.5 балла
    public static void daysInYear(int year) {
        if (isLeapYear(year) == true){
            System.out.println(366);
        } else {
            System.out.println(365);
        }
    }

    //определить номер дня недели по строке
    //например: Понедельник - 1
    //правильный ответ - 1 балл
    public static void dayOfTheWeek(String n){
        switch(n) {
            case "Понедельник":
                System.out.println(1);
                break;
            case "Вторник" :
                System.out.println(2);
                break;
            case "Среда" :
                System.out.println(3);
                break;
            case "Четверг" :
                System.out.println(4);
                break;
            case "Пятница" :
                System.out.println(5);
                break;
            case "Суббота" :
                System.out.println(6);
                break;
            case "Воскресенье" :
                System.out.println(7);
                break;
        }
    }

    //вывести массив на экран в виде: [1, 5, 3, 7, 10, 2, 5]
    //правильное решение - 0.5 балла
    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if(i != array.length - 1){
                System.out.print(array[i] + "," + " ");
            } else{
                System.out.print(array[i]);
            }
        }
        System.out.println("]");
    }
    //вывести двойной массив на экран в виде:
    // [1, 5, 3, 7, 10, 2, 5]
    // [1, 5, 3, 7, 10, 2, 5]
    // ...
    //правильное решение - 0.5 балла
    public static void printArray(int[][] array){
        for(int i =0; i < array.length ; i++ ){
            System.out.print("[");
            for(int j = 0; j < array[i].length; j++){
                if(j != array[i].length - 1) {
                    System.out.print(array[i][j] + "," + " ");
                } else{
                    System.out.print(array[i][j]);
                }
            }
            System.out.print("]");
            System.out.println();
        }
    }

    //отсортировать одномерный массив в порядке возрастания
    //если не знаете, как сортировать, то подсказка -
    //метод пузырька (один из самых простых для понимания)
    //правильный ответ - 1 балл
    public static int[] sort(int[] array){
        int x;
        for(int i = 0; i < array.length; i++){
            for( int j = 0; j < array.length - i - 1; j++){
                if(array[j] > array[j+1]) {
                    x = array[j+1];
                    array[j+1] = array[j];
                    array[j] = x;
                }
            }
        }
        return array;
    }


    //здесь можете тестировать свои решения
    public static void main(String[] args){
        System.out.println("Факториал:");
        System.out.println(fact(6));

        System.out.println("Таблица умножения:");
        table();

        System.out.println("Сумма цифр числа:");
        System.out.println(sum(12345));

        System.out.println("Дней в году:");
        daysInYear(2019);

        System.out.println("День недели:");
        dayOfTheWeek("Понедельник");

        int[] array1D = {1,5,3,7,10,2,5};
        System.out.println("Вывод отсортированного массива:");
        printArray(sort(array1D));

        System.out.println("Вывод двумерного массива:");
        int[][] array2D = {{1,5,3,7,10,2,5}, {1,5,3,7,10,2,5}};
        printArray(array2D);
    }
}