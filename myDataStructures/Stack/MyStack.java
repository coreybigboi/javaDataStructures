package myDataStructures.Stack;

public interface MyStack<T> {
    void push(T element);
    T pop();
    T peek();

    void display();
}
