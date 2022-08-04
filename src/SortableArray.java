import java.lang.reflect.Array;

/**
 * A class which implements and develops sort, set and remove methods
 * @param <T> generic parameter
 * @author Anthony Elia
 */
public class SortableArray<T extends Comparable> implements SortableSequence {

    T[] array;

    /**
     * A constructor used to get the array's length
     * @param arr    generic array's value
     * @param length array's length
     */
    public SortableArray(Class<T> arr, int length) {
        this.array = (T[]) Array.newInstance(arr, length);
    }

    /**
     * This method sorts the array's elements
     */
    @Override
    public void sort() {
        for (int i = 1; i < array.length; i++) {
            T element = array[i];

            int j = 1;
            while (j > 0 && element.compareTo(array[j - 1]) < 0) {
                array[j] = array[j - 1];
                --j;
            }
        }
    }

    /**
     * This methods checks if the array is sorted or not
     * @return return true if the array is sorted, false if not
     */
    @Override
    public boolean isSorted() {
        for (int i = 0; i < array.length - 1; ++i) {
            if (array[i].compareTo(array[i + 1]) > 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * This method sets a new element to the i position
     * @param i array's index
     * @param element new generic element
     */
    public void set(int i, T element) {
        array[i] = element;
    }

    /**
     * This method removes and element from the array
     * @param i the element that will be removed
     */
    public void remove(int i) {
        array[i] = null;
    }
}