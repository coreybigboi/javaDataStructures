package myDataStructures.Queue;

public interface MyQueue<T> {
    void enqueue(T element);
    T dequeue();
    T peek();
    T rear();
    void display();
}
