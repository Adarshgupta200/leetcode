import java.util.*;

class RemoveLinkedListElement {
    int val;
    RemoveLinkedListElement next;
    RemoveLinkedListElement(int val) { this.val = val; }
}

public class Main {
    public static RemoveLinkedListElement removeElements(RemoveLinkedListElement head, int val) {
        RemoveLinkedListElement dummy = new RemoveLinkedListElement(0);
        dummy.next = head;
        RemoveLinkedListElement current = dummy;

        while (current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return dummy.next;
    }

    public static void printList(RemoveLinkedListElement head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  
        RemoveLinkedListElement head = null, tail = null;

        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            RemoveLinkedListElement node = new RemoveLinkedListElement(val);
            if (head == null) {
                head = node;
                tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
        }

        int target = sc.nextInt();  
        head = removeElements(head, target);
        printList(head);
    }
}
