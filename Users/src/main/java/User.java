import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class User {
    private String surname;
    private String name;
    private int age;

    public User(String surname, String name, int age){
        this.setName(name);
        this.setSurname(surname);
        this.setAge(age);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static ArrayList<User> createUsers(){
        ArrayList<User> usersList = new ArrayList<>(10);
        String[] surnames = {"Хоченков", "Скляренко", "Стома", "Семячкин", "Жиганов", "Акантьев", "Беляков", "Зайцев", "Малютина", "Лыкова"};
        String[] names = {"Алексей", "Евгений", "Федор", "Александр", "Максим", "Александр", "Глеб", "Егор", "Полина", "Елена"};
        int[] ages = {18, 19, 19, 20, 20, 20, 21, 23, 19, 18};
        for (int i = 0; i < ages.length; i++) {
            usersList.add(new User(surnames[i], names[i], ages[i]));
        }
        return usersList;
    }

    public static Map<Integer, ArrayList<User>> processUsers(ArrayList<User> userList){
        Map<Integer, ArrayList<User>> map = new HashMap<>();
        for(User user : userList){
            if(map.containsKey(user.getAge())){
                map.get(user.getAge()).add(user);
            }
            else{
                ArrayList<User> list = new ArrayList<>();
                list.add(user);
                map.put(user.getAge(), list);
            }
        }
        return map;
    }

    @Override
    public String toString(){
        return (getSurname().toString() + " " + getName().toString());
    }

    public static void printUserMap(Map<Integer, ArrayList<User>> map){
        for(Integer age : map.keySet()){
            System.out.println("Возраст : " + age);
            System.out.print("Пользователи : ");
            for(User user : map.get(age)){
                System.out.print(user + "; ");
            }
            System.out.println();
        }
    }
}
