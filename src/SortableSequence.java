public interface SortableSequence<T> {


    static <T extends Comparable> void sort() {

    }

    boolean isSorted();

}
