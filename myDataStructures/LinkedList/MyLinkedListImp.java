package myDataStructures.LinkedList;

public class MyLinkedListImp<T> implements MyLinkedList<T> {
    private LinkedListNode<T> head;

    public MyLinkedListImp() {
        this.head = null;
    }

    @Override
    public void addToEnd(T element) {
        LinkedListNode<T> newNode = new LinkedListNode<T>(element, null);

        // case 1: empty list
        if(this.isEmpty()) {
            this.head = newNode;
            return;
        }

        // case 2: non-empty list
        LinkedListNode<T> current = this.head;
        while(current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(newNode);
    }

    @Override
    public void addToBeginning(T element) {
        LinkedListNode<T> newNode = new LinkedListNode<T>(element, this.head);
        this.head = newNode;
    }

    @Override
    public void insertAfter(T element, int position) {
        // guard against empty list
        if(isEmpty()) return;

        // guard against invalid position
        if(position >= this.size() || position < 0) return;

        LinkedListNode<T> newNode = new LinkedListNode<>(element, null);

        int index = 0;
        LinkedListNode<T> current = this.head;

        while(index != position) {
            current = current.getNext();
            index++;
        }

        // insert
        newNode.setNext(current.getNext());
        current.setNext(newNode);
    }

    @Override
    public T get() {
        return null;
    }

    @Override
    public T contains(T element) {
        return null;
    }

    @Override
    public void set(T element, int position) {

    }

    @Override
    public void delete(int position) {

    }

    @Override
    public void display() {
        if(this.isEmpty()) {
            System.out.println("[]");
            return;
        }

        LinkedListNode<T> current = this.head;
        System.out.print("[");

        while (current.getNext() != null) {
            System.out.print(current.getData() + ", ");
            current = current.getNext();
        }

        System.out.print(current.getData() + "]\n");
    }

    @Override
    public int size() {
        if(isEmpty()) return 0;

        int size = 0;
        LinkedListNode<T> current = this.head;

        while(current != null) {
            size++;
            current = current.getNext();
        }

        return size;
    }

    @Override
    public boolean isEmpty() {
        return this.head == null;
    }

    @Override
    public void clear() {
        this.head = null;
    }
}
