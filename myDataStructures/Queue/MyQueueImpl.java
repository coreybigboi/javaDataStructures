package myDataStructures.Queue;

import myDataStructures.LinkedList.MyLinkedList;
import myDataStructures.LinkedList.MyLinkedListImp;

public class MyQueueImpl<T> implements MyQueue<T> {

    private final MyLinkedList<T> queue;

    public MyQueueImpl() {
        this.queue = new MyLinkedListImp<T>();
    }

    @Override
    public void enqueue(T element) {
        this.queue.addToEnd(element);
    }

    @Override
    public T dequeue() {
        T element = queue.get(0);
        queue.delete(0);
        return element;
    }

    @Override
    public T peek() {
        return queue.get(0);
    }

    @Override
    public T rear() {
        return queue.get(queue.size() - 1);
    }

    @Override
    public void display() {
        queue.display();
    }
}
