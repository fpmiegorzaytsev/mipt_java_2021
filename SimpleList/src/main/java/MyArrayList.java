import java.util.NoSuchElementException;

public class MyArrayList implements SimpleList {
    private int[] array;
    private int size = 0;
    private int capacity = 10;


    public MyArrayList() {
        this.array = new int[capacity];
    }
    public MyArrayList(int capacity) {
        this.capacity = capacity;
        this.array = new int[capacity];

    }
    @Override
    public void add(int item) {
        if (capacity == size) {
            capacity = capacity * 2;
            int[] arrayCopy = this.array;
            this.array = new int[capacity];
            for (int i = 0; i < arrayCopy.length; i++) {
                array[i] = arrayCopy[i];
            }
        }
        array[size] = item;
        size++;
    }
    @Override
    public int remove(int idx) throws NoSuchElementException {

        if (idx > -1 && idx < size) {
            int removedElement = array[idx];
            for (int i = idx; i < size; i++) {
                array[i] = array[i+1];
            }
            int[] arrayCopy = this.array;
            this.array = new int[capacity - 1];
            for (int i = 0; i < size; i++) {
                array[i] = arrayCopy[i];
            }
            size--;
            return removedElement;
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public int size() {
        return this.size;
    }
    @Override
    public int get(int idx) throws NoSuchElementException{

        if (idx > -1 && idx < size) {
            return array[idx];
        }
        else {
            throw new NoSuchElementException();
        }
    }
}
