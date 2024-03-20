public interface MyLinkedList<T> {

    // insertion methods
    void addToEnd();
    void addToBeginning();
    void insertAfter();

    // access methods
    T get();
    T contains(T element);

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
