import java.rmi.server.ExportException;
import java.util.Scanner;

public class Queue {
    Scanner sc = new Scanner(System.in);

    node head = null;

    //add x, return true if success, else throw exception
    void add(int x) {
        if (head == null) {
            head = new node(x);
        } else {
            node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new node(x);
        }
    }

    //add x, return true if success, else return false
    void offer() {

    }

    //return 1st num, throw exception if null
    void element() {
        try {
            System.out.println("so dau tien: ");
            System.out.println(head.data);
        } catch (Exception e) {
            System.out.println("null");
        }
    }

    void input() {
        boolean a = true;
        while (a) {
            System.out.println("nhap x: ");
            int x = sc.nextInt();
            if (x == 0) {
                return;
            }
            if (head == null) {
                head = new node(x, head);
            } else {
                node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = new node(x);
            }
        }
    }

    //return 1st num, return false if null
    void peek() {

    }

    //return+remove head, throw exception if null
    void remove() {
        try {
            System.out.println("so dau tien: " + head.data);
            head = head.next;
        } catch (Exception e) {
            System.out.println("fail!");

        }
    }

    //return+remove head, return false if cant
    void poll() {

    }

    void output() {
        try {
            node temp = head;
            while (temp != null) {
                System.out.print(temp);
                temp = temp.next;
            }
            System.out.println("null");
        } catch (Exception e) {
            System.out.println("null");
        }
    }

    void insert() {
        try {
            node temp = head;
            System.out.println("vi tri muon them vao");
            int x = sc.nextInt();
            if (x == 0) {
                System.out.println("nhap so muon them vao: ");
                head = new node(sc.nextInt(), head);
            }
            while (temp.next != null) {
                x -= 1;
                if (x == 0) {
                    System.out.println("nhap so muon them: ");
                    temp.next = new node(sc.nextInt(), temp.next);
                    return;
                }
                temp = temp.next;
            }
        } catch (Exception e) {
            System.out.println("fail!");
        }
    }

    void delete() {

    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.input();
        queue.output();
        queue.insert();
        queue.output();
    }
}
