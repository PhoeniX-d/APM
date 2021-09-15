import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }
}

class LinkedList {
    Node head;

    void append(int data) {
        Node newNode = new Node(data);
        
        if (head == null)
            head = newNode;
        else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void reverse() {
        Node prevNode = null;
        Node nextNode;
        Node currentNode = head;
        while (currentNode != null) {
            nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }
        head = prevNode;
    }
}

public class List {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        String ch;

        do {
            System.out.println("Enter the value:");
            int val = sc.nextInt();
            list.append(val);
            System.out.println("Do you want to add another node? Type Yes/No");

            ch = sc.next();
        } while (ch.equals("Yes") || (ch.equals("yes")));

        System.out.println("The elements in the linked list are:");
        list.display();
        list.reverse();
        System.out.println("The elements in the reversed linked list are :");
        list.display();
        sc.close();
    }
}
