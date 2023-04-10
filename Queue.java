import java.util.Scanner;

public class Queue {
    Scanner sc = new Scanner(System.in);
    static node head, tail;

    Queue() {
        head = null;
        tail = null;
    }

    ;

    void add(int x) {
        if (head == null) {
            head = new node(x);
            tail = head;
        } else {
            tail.next = new node(x);
            tail = tail.next;
        }
    }

    boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }

    int count(node node) {
        if (node != null) {
            return count(node.next) + 1;
        }
        return 0;
    }

    void input() {
        while (true) {
            System.out.println("nhap x: ");
            int x = sc.nextInt();
            if (x == 0) {
                return;
            }
            add(x);
        }
    }

    int countodd(node node) {
        if (node != null) {
            if (node.data % 2 == 0) {
                return countodd(node.next);
            }
            return countodd(node.next) + 1;
        }
        return 0;
    }

    int counteven(node node) {
        if (node != null) {
            if (node.data % 2 != 0) {
                return counteven(node.next);
            }
            return counteven(node.next) + 1;
        }
        return 0;
    }



    void output() {
        node temp = head;
        while (temp != null) {
            System.out.print(temp);
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.input();
        queue.output();
        System.out.println("so phan tu: " + queue.count(head));
        System.out.println("so phan tu le: " + queue.countodd(head));
        System.out.println("so phan tu chan: " + queue.counteven(head));
    }
}