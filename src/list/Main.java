package list;

public class Main {
    public static void main(String[] args) {
        //Test ArrayList
        List<String> arrayList = new ArrayList<>();
        dataTest(arrayList);

        System.out.println("\n");

        //Test LinkedList
        List<String> linkedList = new LinkedList<>();
        dataTest(linkedList);
    }

    private static void dataTest(List<String> list) {
        List<String> myList = list;

        myList.add("One");
        myList.add("Two");
        myList.add("Three");

        System.out.println("Size of the list: " + myList.size());
        System.out.println("Is the list empty? " + myList.isEmpty());

        System.out.println("Contains 'Two'? " + myList.contains("Two"));
        System.out.println("Contains 'Four'? " + myList.contains("Four"));

        myList.add("Four");
        System.out.println("Contains 'Four' after adding? " + myList.contains("Four"));

        myList.remove("Two");
        System.out.println("List after removing 'Two': " + myList);

        myList.add("Inserted", 1);
        System.out.println("List after inserting at index 1: " + myList);

        myList.set(2, "New Three");
        System.out.println("List after setting at index 2: " + myList);

        System.out.println("Element at index 2: " + myList.get(2));

        myList.remove(0);
        System.out.println("List after removing at index 0: " + myList);

        System.out.println("Index of 'New Three': " + myList.indexOf("New Three"));
        System.out.println("Last index of 'New Three': " + myList.lastIndexOf("New Three"));

        myList.clear();
        System.out.println("Is the list empty after clearing? " + myList.isEmpty());
    }
}
