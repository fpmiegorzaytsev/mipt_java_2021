import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Note{

    private final ReentrantReadWriteLock Lock = new ReentrantReadWriteLock();
    private final ReentrantReadWriteLock.ReadLock readLock = Lock.readLock();
    private final ReentrantReadWriteLock.WriteLock writeLock = Lock.writeLock();
    public final List<String> notes = new ArrayList<>();

    public void addNote(int index, String note)
    {
        writeLock.lock();
        try {
            System.out.println("Сейчас будет добавлена заметка [" + note + "] На позицию " + index);
            notes.add(index, note);
            System.out.println("Уже добавлена заметка [" + note + "]");
        } finally {
            writeLock.unlock();
        }
    }

    public void removeNote(int index)
    {
        writeLock.lock();
        try {
            System.out.println("Сейчас будет удалена заметка с позиции " + index);
            String note;
            note = notes.remove(index);
            System.out.println("Уже удалена заметка [" + note + "] с позиции " + index);
        } finally {
            writeLock.unlock();
        }
    }

    public void readNote(int index)
    {
        readLock.lock();
        try {
            System.out.println("Сейчас будет прочтена заметка с позиции " + index);
            String note;
            note = notes.get(index);
            System.out.println("Прочтена заметка [" + note + "] с позиции " + index);
        } finally {
            readLock.unlock();
        }
    }
}
