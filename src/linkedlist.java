public class linkedlist {
    public static void main(String[]args){
        Linked head=new Linked(10);
        Linked second=new Linked(15);
        Linked third=new Linked(20);
        head.next=second;
        second.next=third;
        Linked current=head;
        while(current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println("null");
    }
}
class Node{
    int data;
    Linked next;

    Node(int data){
        this.data=data;
        this.next=null;

    }
}