package Workshop2;

public class LinkedList<T> {
    private Node<T> head;

    public void add(T data){
        Node<T> newNode = new Node<T>(data);
        if(head == null){
            head = newNode;
        } else {
            Node<T> current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void display(){
        Node<T> current = head;
        while(current != null){
            System.out.print(current.data + "-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void reverse(){
        Node<T> prev = null;
        Node<T> curr = head;
        Node<T> next = null;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
}
