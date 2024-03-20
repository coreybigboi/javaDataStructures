import myDataStructures.LinkedList.MyLinkedList;
import myDataStructures.LinkedList.MyLinkedListImp;
import myDataStructures.Queue.MyQueue;
import myDataStructures.Queue.MyQueueImpl;
import myDataStructures.Stack.MyStack;
import myDataStructures.Stack.MyStackImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        startProgram();
    }

    private static void startProgram() {
        Scanner scanner = new Scanner(System.in);
        boolean agrees = true;

        System.out.println("Welcome to the data structure testing program. Created by Corey Barr, 2024.\n");

        while (agrees) {
            testSelect(scanner);
            agrees = askRepeat(scanner);
        }

        System.out.println("\nThank you for using this program :)");
    }

    private static void testSelect(Scanner scanner) {
        final int NUMBER_OPTIONS = 4;
        int choice = 0;

        while (choice < 1 || choice > NUMBER_OPTIONS ) {
            System.out.println("Select data structure to test (type number):");
            System.out.println("1. Linked List (Strings)");
            System.out.println("2. Linked List (Integers)");
            System.out.println("3. Stack");
            System.out.println("4. Queue");

            choice = scanner.nextInt();
        }

        switch (choice) {
            case 1:
                testStringLinkedList();
                break;

            case 2:
                testIntLinkedList();
                break;

            case 3:
                testStack();
                break;

            case 4:
                testQueue();
                break;
        }
    }

    private static boolean askRepeat(Scanner scanner) {
        System.out.println("\nWould you like to complete another Test? (y/n)");
        String answer = scanner.next();
        return answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes");
    }

    private static void testStringLinkedList() {
        MyLinkedList<String> stringList = new MyLinkedListImp<String>();

        System.out.println("Testing a list of strings");

        System.out.println("\nCreated empty list");
        stringList.display();

        System.out.println("\nAdding 'there!' to beginning:");
        stringList.addToBeginning("there!");
        stringList.display();

        System.out.println("\nAdding 'Hello' to the beginning:");
        stringList.addToBeginning("Hello");
        stringList.display();

        System.out.println("\nAdding 'Kenobi...' to the end:");
        stringList.addToEnd("Kenobi...");
        stringList.display();

        System.out.println("\nAdding 'General' after the second element:");
        stringList.insertAfter("General", 1);
        stringList.display();

        System.out.println("\nGetting the third element:");
        System.out.println(stringList.get(2));

        System.out.println("\nList contains 'Leia':");
        System.out.println(stringList.contains("Leia"));

        System.out.println("\nList contains 'General':");
        System.out.println(stringList.contains("General"));

        System.out.println("\nChanging 4th element to 'Kenobi!'");
        stringList.set("Kenobi!", 3);
        stringList.display();

        System.out.println("\nDeleting the 3rd element:");
        stringList.delete(2);
        stringList.display();

        System.out.println("\nClearing list:");
        stringList.clear();
        stringList.display();
    }

    public static void testIntLinkedList() {
        MyLinkedList<Integer> intList = new MyLinkedListImp<Integer>();

        System.out.println("Testing a list of integers");

        System.out.println("\nCreated empty list");
        intList.display();

        System.out.println("\nAdding 1 to beginning:");
        intList.addToBeginning(1);
        intList.display();

        System.out.println("\nAdding 2 to the beginning:");
        intList.addToBeginning(2);
        intList.display();

        System.out.println("\nAdding 3 to the end:");
        intList.addToEnd(3);
        intList.display();

        System.out.println("\nAdding 5 after the second element:");
        intList.insertAfter(5, 1);
        intList.display();

        System.out.println("\nGetting the third element:");
        System.out.println(intList.get(2));

        System.out.println("\nList contains 12:");
        System.out.println(intList.contains(12));

        System.out.println("\nList contains 2:");
        System.out.println(intList.contains(2));

        System.out.println("\nChanging 4th element to 100:");
        intList.set(100, 3);
        intList.display();

        System.out.println("\nDeleting the 3rd element:");
        intList.delete(2);
        intList.display();

        System.out.println("\nClearing list:");
        intList.clear();
        intList.display();
    }

    private static void testStack(){
        final MyStack<Character> stack = new MyStackImpl<Character>();

        System.out.println("Testing stack.");

        System.out.println("\nCreated empty stack:");
        stack.display();

        System.out.println("\nPushing J");
        stack.push('J');
        stack.display();

        System.out.println("\nPushing A");
        stack.push('A');
        stack.display();

        System.out.println("\nPushing V");
        stack.push('V');
        stack.display();

        System.out.println("\nPushing A");
        stack.push('A');
        stack.display();

        System.out.println("\nChecking top of stack:");
        System.out.println(stack.peek());

        System.out.println("\nPop:");
        stack.pop();
        stack.display();

        System.out.println("\nPop:");
        stack.pop();
        stack.display();

        System.out.println("\nPop:");
        stack.pop();
        stack.display();

        System.out.println("\nPop:");
        stack.pop();
        stack.display();
    }

    private static void testQueue() {
        final MyQueue<Integer> queue = new MyQueueImpl<Integer>();

        System.out.println("Testing queue.");

        System.out.println("\nCreated empty queue:");
        queue.display();

        System.out.println("\nAdded 1:");
        queue.enqueue(1);
        queue.display();

        System.out.println("\nAdded 100");
        queue.enqueue(100);
        queue.display();

        System.out.println("\nAdded 250");
        queue.enqueue(250);
        queue.display();

        System.out.println("\nFront of queue:");
        System.out.println(queue.peek());

        System.out.println("\nBack of queue:");
        System.out.println(queue.rear());

        System.out.println("\nDequeue:");
        queue.dequeue();
        queue.display();

        System.out.println("\nDequeue:");
        queue.dequeue();
        queue.display();

        System.out.println("\nDequeue:");
        queue.dequeue();
        queue.display();
    }
}
