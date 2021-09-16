import java.util.Scanner;

class ListOccurance {
    static Node head;

    private static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null)
            head = newNode;
        else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = newNode;
        }
    }

    int findOccurrence(Node temp, int item, int occurrence) {
        if (temp != null) {
            if (temp.data == item) {
                occurrence++;
            }
            return findOccurrence(temp.next, item, occurrence);
        }
        return occurrence;
    }

    void displayList(Node temp){
        if(temp != null){
            System.out.print(temp.data + " ");
            displayList(temp.next);
        }
    }
    public static void main(String args[]) {
        ListOccurance list = new ListOccurance();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the list:");
        int n = sc.nextInt();
        if (n == 0 || n < 0) {
            System.out.println("Invalid Input");
            sc.close();
            return;
        } else {
            for (int i = 0; i < n; i++) {
                list.append(sc.nextInt());
            }
            System.out.println("Printing the list:");
            list.displayList(ListOccurance.head);
            System.out.println();
            System.out.println("Enter the key to find it's occurrence:");
            int key = sc.nextInt();
            int count = 0;
            System.out.println(key + " occurs for " + list.findOccurrence(ListOccurance.head, key, count) + " times.");
        }
        sc.close();
    }
}