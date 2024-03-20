package myDataStructures.Stack;

import myDataStructures.LinkedList.MyLinkedList;
import myDataStructures.LinkedList.MyLinkedListImp;

public class MyStackImpl<T> implements MyStack<T> {
    private final MyLinkedList<T> stack;

    public MyStackImpl() {
        this.stack = new MyLinkedListImp<T>();
    }

    @Override
    public void push(T element) {
        this.stack.addToBeginning(element);
    }

    @Override
    public T pop() {
        T element = this.stack.get(0);
        this.stack.delete(0);
        return element;
    }

    @Override
    public T peek() {
        return this.stack.get(0);
    }

    @Override
    public void display() {
        this.stack.display();
    }
}
