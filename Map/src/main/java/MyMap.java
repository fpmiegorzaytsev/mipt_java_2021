import java.util.*;
import java.util.Set;

public class MyMap {

    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        String[] surnames = {"Хоченков", "Скляренко", "Стома", "Семячкин", "Жиганов", "Акантьев", "Беляков", "Зайцев", "Малютина", "Лыкова"};
        String[] names = {"Алексей", "Евгений", "Федор", "Александр", "Максим", "Александр", "Глеб", "Егор", "Полина", "Елена"};
        for (int i = 0; i < names.length; i++) {
            map.put(surnames[i], names[i]);
        }
        return map;
    }
    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        ArrayList<String> names = new ArrayList<>(map.values());
        ArrayList<String> deleteNames = new ArrayList<>();
        for (int i = 0; i < names.size(); i++) {
            for (int j = i + 1; j < names.size(); j++) {
                if (names.get(i).equals(names.get(j))) {
                    deleteNames.add(names.get(i));
                    break;
                }
            }
        }
        for(String name : deleteNames){
            MyMap.removeItemFromMapByValue(map, name);
        }
    }
    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Set<String> surnamesSet = map.keySet();
        ArrayList<String> deleteKeys = new ArrayList<>();
        String[] surnames = new String[surnamesSet.size()];
        surnamesSet.toArray(surnames);
        for (int i = 0; i < surnames.length; i++) {
            if(map.get(surnames[i]).equals(value)){
                deleteKeys.add(surnames[i]);
            }
        }
        for(String delete : deleteKeys){
            map.remove(delete);
        }
    }
    public static void printMap(Map<String,String> map){
        Iterator<String> surnames = map.keySet().iterator();
        ArrayList<String> names = new ArrayList<>(map.values());
        for (int i = 0; i < names.size(); i++) {
            System.out.print(surnames.next() + " " + names.get(i) + "; ");
        }
    }
    public static void main(String[] args) {
        Map<String, String> map = MyMap.createMap();
        MyMap.printMap(map);
        System.out.println();
        MyMap.removeTheFirstNameDuplicates(map);
        MyMap.printMap(map);
    }
}

