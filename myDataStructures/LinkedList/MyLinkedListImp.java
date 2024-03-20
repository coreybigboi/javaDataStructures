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
        if (this.isEmpty()) {
            this.head = newNode;
            return;
        }

        // case 2: non-empty list
        LinkedListNode<T> current = this.head;
        while (current.getNext() != null) {
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
        if (isEmpty()) return;

        // guard against invalid position
        if (position >= this.size() || position < 0) return;

        LinkedListNode<T> newNode = new LinkedListNode<>(element, null);

        int index = 0;
        LinkedListNode<T> current = this.head;

        while (index != position) {
            current = current.getNext();
            index++;
        }

        // insert
        newNode.setNext(current.getNext());
        current.setNext(newNode);
    }

    @Override
    public T get(int position) {
        // guard for empty list
        if (isEmpty()) return null;

        // guard for invalid position
        if (position < 0 || position >= size()) return null;

        int index = 0;
        LinkedListNode<T> current = this.head;

        while (index != position) {
            current = current.getNext();
            index++;
        }

        return current.getData();
    }

    @Override
    public boolean contains(T element) {
        if (isEmpty()) return false;

        LinkedListNode<T> current = this.head;

        while (current != null) {
            if(current.getData().equals(element)) return true;
            current = current.getNext();
        }

        return false;
    }

    @Override
    public void set(T element, int position) {
        // guard against invalid position
        if (position < 0 || position > size()) return;

        if (position == size()) {
            addToEnd(element);
        }

        if (isEmpty()) {
            addToBeginning(element);
        }

        int index = 0;
        LinkedListNode<T> current = this.head;

        while (index != position && current != null) {
            current = current.getNext();
            index++;
        }

        assert current != null;
        current.setData(element);
    }

    @Override
    public void delete(int position) {
        // guard against invalid position
        if (position < 0 || position >= size()) return;

        if (isEmpty()) return;

        // case 1: first element
        if (position == 0) {
            this.head = this.head.getNext();
            return;
        }

        int index = 0;
        LinkedListNode<T> before = null;
        LinkedListNode<T> current = this.head;

        while (index != position ) {
            before = current;
            current = current.getNext();
            index++;
        }

        // case 2: middle of list
        if (current != null){
            before.setNext(current.getNext());
        }
        else { // case 3: end of list
            before.setNext(null);
        }
    }

    @Override
    public void display() {
        if (this.isEmpty()) {
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
        if (isEmpty()) return 0;

        int size = 0;
        LinkedListNode<T> current = this.head;

        while (current != null) {
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
