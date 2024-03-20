import myDataStructures.LinkedList.MyLinkedList;
import myDataStructures.LinkedList.MyLinkedListImp;

public class Main {
    public static void main(String[] args) {
       showLinkedList();
    }

    private static void showLinkedList() {
        MyLinkedList<String> stringList = new MyLinkedListImp<String>();

        System.out.println("Created empty list");
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
    }
}
