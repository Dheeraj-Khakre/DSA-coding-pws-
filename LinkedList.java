
public class LinkedList {

    private Node head;

    private class Node {

        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        }
        newNode.next = head;
        head = newNode;
    }

     public void printList() {
        
        if (head == null) {
            System.out.println("List is empty");
        }
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        // TODO code application logic here
        LinkedList list = new LinkedList();
        list.addFirst("dk mid ");
        list.addFirst("night sky");
        list.printList();
    }
}
