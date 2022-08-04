/**
 * @author Mirko Di Cristina
 * @param <T> Generic parameter.
 * Implementation of methods for sorting.
 */
public interface SortableSequence<T> {

   void sort(int index);
   boolean isSorted(int index);
}
