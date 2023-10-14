import java.util.Scanner;

public class Main {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    public void createLinkedList() {
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter data: ");
            int data = sc.nextInt();
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }
            System.out.println("Do you want to add more data? Press 1 to continue: ");
            n = sc.nextInt();
        } while (n == 1);
    }

    public void traverse() {
        Node temp = head;
        if (head == null) {
            System.out.println("Linked list does not exist");
        } else {
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        Main m = new Main();
        m.createLinkedList();
        m.traverse();
    }
}
