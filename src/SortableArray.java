import java.util.ArrayList;

public class SortableArray<T extends Comparable> implements SortableSequence {

    int length;
    T[] array;

    public SortableArray(int length) {
        this.array = (T[]) new ArrayList<T>(length).toArray();
    }

    @Override
    public void sort() {
        for (int i = 1; i < array.length; i++) {
            T element = (T) array[i];

            int j = 1;
            while (j > 0 && element.compareTo(array[j - 1]) < 0) {
                array[j] = array[j - 1];
                --j;
            }
        }
    }

    @Override
    public boolean isSorted() {
        for (int i = 0; i < array.length - 1; ++i) {
            if (array[i].compareTo(array[i + 1]) > 0) {
                return false;
            }
        }
        return true;
    }

    public void set(int i, T element) {
        array[i] = element;
    }

    public void remove(int i) {
        array[i] = null;
    }
}
