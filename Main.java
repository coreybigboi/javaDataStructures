import myDataStructures.LinkedList.MyLinkedList;
import myDataStructures.LinkedList.MyLinkedListImp;

public class Main {
    public static void main(String[] args) {
       //testStringLinkedList();
        testIntLinkedList();
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
    }
}
