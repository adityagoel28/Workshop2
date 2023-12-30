package Workshop2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Workshop 2!");

        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(12);
        list.add(10);
        list.add(50);
        System.out.println("Original list:");
        list.display();
        list.reverse();
        System.out.println("Reversed list:");
        list.display();
    }
}