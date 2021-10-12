import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void printList(ArrayList<Integer> list) {
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) throws InputException {
        Scanner console = new Scanner(System.in);
        String line = console.nextLine();
        String[] input = line.split(" ");
        ArrayList<Integer> list= new ArrayList<>();
        ArrayList<Integer> dividesThreeList = new ArrayList<>();
        ArrayList<Integer> dividesTwoList = new ArrayList<>();
        ArrayList<Integer> dividesNothingList = new ArrayList<>();
        try {
            for (String string : input) {
                list.add(Integer.parseInt(string));
            }
        } catch (NumberFormatException e) {
            throw new InputException("Error![" + line + "] contains incorrect amount!");
        }
        if(list.size() != 20){
            throw new InputException("You entered wrong quantity of numbers. " + list.size() + " is not correct amount");
        }
        for(Integer integer : list){
            if(integer % 3 == 0){
                dividesThreeList.add(integer);
            }
            if(integer % 2 == 0){
                dividesTwoList.add(integer);
            }
            if(integer % 3 !=0 && integer % 2 != 0){
                dividesNothingList.add(integer);
            }
        }
        System.out.print("First list is : ");
        Main.printList(dividesThreeList);
        System.out.print("Second list is : ");
        Main.printList(dividesTwoList);
        System.out.print("Third list is : ");
        Main.printList(dividesNothingList);
    }
}
