import java.util.*;

class node {
    int data;
    node next;

    node() {

    }

    node(int t) {
        this.data = t;
    }

    node(int t, node temp) {
        this.data = t;
        this.next = temp;
    }

    public static void swap(node a, node b) {
        int temp = a.data;
        a.data = b.data;
        b.data = temp;
    }

    public String toString() {
        String t = this.data + "->";
        return t;
    }

}

public class LinkedList {
    node n = new node();
     static Scanner sc = new Scanner(System.in);
    static node head = null;

    void add(int x) {
        node New = new node(x, head);
        head = New;
    }

    void input() {
        System.out.println("so luong: ");
        int n = sc.nextInt();
        node temp = head;
        for (int i = 0; i < n; i++) {
            if (head == null) {
                temp = head = new node(sc.nextInt());
            } else {
                temp.next = new node(sc.nextInt());
                temp = temp.next;
            }
        }
    }

    void inputtozero() {
        System.out.println("nhap so muon them: ");
        int k = sc.nextInt();
        if (head == null) {
            head = new node(k, head);
        }
        node temp = head;
        while (k != 0) {
            System.out.println("nhap so muon them:");
            k = sc.nextInt();
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new node(k);
        }
    }

    void output() {
        node temp = head;
        while (temp != null) {
            System.out.print(temp);
            temp = temp.next;
        }
        System.out.println("null");
    }

    void deletebynum() {
        System.out.println("nhap gia tri muon xoa: ");
        int k = sc.nextInt();
        if (head == null) {
            System.out.println("fail!");
            return;
        }
        node temp = head;
        if (head.next == null || head.data == k) {
            head = head.next;
            return;
        }
        while (temp.next != null) {
            if (temp.next.data == k) {
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }

    }

    void deletebylocation() {
        System.out.println("nhap vi tri muon xoa: ");
        int k = sc.nextInt();
        if (head == null) {
            System.out.println("fail");
            return;
        }
        if (k == 0) {
            head = head.next;
            return;
        }
        node temp = head;
        for (int i = 0; i < k - 1; i++) {
            if (temp.next == null) {
                System.out.println("fail");
                return;
            }
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    void append() {
        node temp = head;
        System.out.println("nhap so muon them vao cuoi: ");
        if (temp == null) {
            head = new node(sc.nextInt());
            return;
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new node(sc.nextInt());

    }

    void insert() {
        System.out.println("nhap vi tri va so muon them: ");
        int k = sc.nextInt(), n = sc.nextInt();
        if (head == null) {
            System.out.println("fail");
            return;
        }
        if (k == 0) {
            head = new node(n, head);
            return;
        }
        node temp = head;

        while (temp != null) {
            k--;
            if (k == 0) {
                break;
            }
            temp = temp.next;

        }
        if (k > 0) {
            System.out.println("fail!");
            return;
        }
        node t = new node(n, temp.next);
        temp.next = t;
    }

    void reverse() {
        ArrayList<Integer> a = new ArrayList<>();
        if (head == null) {
            System.out.println("fail");
            return;
        }
        node temp = head;
        while (temp != null) {
            a.add(temp.data);
            temp = temp.next;
        }
        node add = head;
        for (int i = a.size() - 1; i >= 0; i--) {
            add.data = a.get(i);
            add = add.next;
        }
    }

    void takemid() {
        ArrayList<Integer> save = new ArrayList<>();
        if (head == null) {
            System.out.println("fail!");
            return;
        }
        node temp = head;
        while (temp != null) {
            save.add(temp.data);
            temp = temp.next;
        }
        System.out.println("phan tu o giua: " + save.get(save.size() / 2));
    }

    void addinpalace() {
        System.out.println("nhap so muon them vao: ");
        int k = sc.nextInt();
        if (head == null) {
            head = new node(k);
            return;
        }
        if (head.data > k) {
            head = new node(k, head);
            return;
        }
        node temp = head;
        while (temp.next != null) {
            if (temp.next.data > k) {
                node t = new node(k, temp.next);
                temp.next = t;
                return;
            }
            temp = temp.next;
        }
        temp.next = new node(k);
    }

    void checkascending() {
        if (head == null) {
            System.out.println("fail!");
            return;
        }
        node temp = head;
        while (temp.next != null) {
            if (temp.next.data < temp.data) {
                System.out.println("not ascending!");
                return;
            } else {
                temp = temp.next;
            }
        }
        System.out.println("ascending!");

    }

    void deleteodd() {
        if (head == null) {
            System.out.println("fail!");
            return;
        }
        if (head.data % 2 == 1) {
            head = head.next;
        }
        node temp = head;
        while (temp.next.next != null) {
            if (temp.next.data % 2 == 1) {
                temp.next = temp.next.next;
                deleteodd();
            } else {
                temp = temp.next;
            }
        }
        if (temp.next.data % 2 == 1) {
            temp.next = null;
        }
    }

    void sort() {
        if (head == null || head.next == null) {
            System.out.println("fail!");
            return;
        }
        node temp = head;
        while (temp.next != null) {
            if (temp.data > temp.next.data) {
                n.swap(temp, temp.next);
                temp = head;
            } else {
                temp = temp.next;
            }
        }
    }

    void inputrecursion() {
        System.out.println("nhap so muon them vao: ");
        int x = sc.nextInt();
        if (x != 0) {
            if (head == null) {
                head = new node(x);
                inputrecursion();
            } else {
                node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = new node(x);
                inputrecursion();
            }
        }
    }

    void outputrecuresion(node node) {
        if (node == null) ;
        else {
            System.out.println(node);
            outputrecuresion(node.next);
        }
    }

    void sortrecursion() {
        if (head == null || head.next == null) {
            return;
        }
        node temp = head;
        while (temp.next != null) {
            if (temp.data < temp.next.data) {
                node.swap(temp, temp.next);
                sortrecursion();
            }
            temp = temp.next;
        }
    }

    node findx(int x, node node) {
        if (node == null) {
            return null;
        } else {
            if (node.data == x) {
                return node;
            } else {
                return findx(x, node.next);
            }
        }
    }

    int find(int x) {
        node node = findx(x, head);
        int count = 0;
        node temp = head;
        while (temp != null) {
            if (temp == node) {
                return count;
            }
            count++;
            temp = temp.next;
        }
        return -99;
    }

    void insertrecuresion(int x, int k, node node) {
        if(k<0){
            System.out.println("fail!");
            return;
        }
        if(k==0){
            head=new node(x,head);
            return;
        }

        if(node!=null){
            if(k==1){
                node.next=new node(x,node.next);
                return;
            }
            insertrecuresion(x,k-1,node.next);
        }

    }




    int countrecursion(node node) {
        if (node != null) {
            return countrecursion(node.next) + 1;
        }
        return 0;
    }

    int sumrecuresion(node node) {
        if (node != null) {
            return sumrecuresion(node.next) + node.data;
        }
        return 0;
    }

    public static void main(String[] args) {
        LinkedList linklist = new LinkedList();
        linklist.inputrecursion();
        linklist.output();
        linklist.insertrecuresion(999,4,head);
        linklist.output();
    }
}
