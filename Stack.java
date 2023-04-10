import java.util.Scanner;

public class Stack {
    Scanner sc = new Scanner(System.in);
    node head, last;

    Stack() {
        head = null;
        last = null;
    }

    void push() {
        System.out.println("nhap so muon them vao: ");
        if (head == null) {
            head = new node(sc.nextInt());
            last = head;
        } else {
            head = new node(sc.nextInt(), head);
        }

    }

    void input() {
        while (true) {
            System.out.println("nhap x: ");
            int x = sc.nextInt();
            if (x == 0) {
                return;
            }
            if(head==null){
                head=new node(x);
                last=head;
            }else {
                last.next=new node(x);
                last=last.next;
            }
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

    void min() {

    }

    void max() {

    }

    void sum() {
        int ans=0;
        node temp=head;
        while(temp!=null){
            ans+=temp.data;
            temp=temp.next;
        }
        System.out.println("tong: "+ans);
    }

    void pop() {
        try{
            System.out.println("gia tri dau tien: "+head.data);
            head=head.next;
        }catch (Exception e){
            System.out.println(e);
        }
    }

    void peek() {
        try{
            System.out.println("gia tri dau tien: "+head.data);
        }catch (Exception e){
            System.out.println(e);
        }
    }

    boolean isEmpty() {
        return head == null;
    }

    void search() {
        System.out.println("nhap so muon tim: ");
        int x=sc.nextInt();
        node temp=head;
        int ans=0;
        while(temp!=null){
            if(temp.data==x){
                System.out.println("vi tri: "+ans );
                return;
            }
            ans+=1;
            temp=temp.next;
        }
        System.out.println("khum co");

    }

    void capacity() {
        node temp=head;
        int ans=0;
        while (temp!=null){
            ans+=1;
            temp=temp.next;
        }
        System.out.println("capacity: "+ans);
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.input();
        stack.output();
        stack.capacity();
    }
}
