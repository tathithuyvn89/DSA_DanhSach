package BT_trienkhaiLinkedArrayList;

import org.w3c.dom.Node;

public class MyLinkedList2<E> {
    private Node head;
    private int numNodes;
    public MyLinkedList2(Object data){
        head=  new Node(data);
    }
    private class Node {
        private Node next;
        private Object data;
        public Node(Object data){
            this.data=data;
        }

        public Object getData() {
            return this.data;
        }
    }
    public void add (int index, E e){
        Node temp=head;
        Node holder;
        for (int i=0;i<index-1&&temp.next!=null;i++){
            temp=temp.next;
        }
        holder= temp.next;
        temp.next=new Node(e);
        temp.next.next=head;
        numNodes++;
    }
    public void addFist(E e){
        Node temp=head;
        head= new Node(e);
        head.next=temp;
        numNodes++;
    }
    public void addLast(E e){
        Node holder= new Node(e);

    }
    public void printList(){
        Node temp=head;
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }


}
