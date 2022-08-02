public interface SortableSequence<T> {

    <T extends Comparable> void sort();
     
    boolean isSorted();
}
