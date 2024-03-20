package myDataStructures.LinkedList;

public interface MyLinkedList<T> {

    // insertion methods
    void addToEnd(T element);
    void addToBeginning(T element);
    void insertAfter(T element, int position);

    // access methods
    T get(int position);
    boolean contains(T element);

    // modifcation
    void set(T element, int position);
    void delete(int position);

    // traversal methods
    void display();

    // utility methods
    int size();
    boolean isEmpty();
    void clear();
}
