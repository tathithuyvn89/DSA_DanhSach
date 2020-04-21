package BT_trienkhaiLinkedArrayList;

import org.w3c.dom.Node;
import thuchanh_MyLinkedArray.MyLinkedList;

public class MyLinkedList2<E> {
    private Node head=null;
    private Node tail=null;
    private int numNodes;
    public MyLinkedList2(){

    }

    private class Node <E> {
        private Node <E> next;
        private E element;
        public Node(E element){
            this.element=element;
        }

        public E getElement() {
            return this.element;
        }
    }
    public void addFist(E e){
        Node newNode= new Node(e);
        newNode.next=head;
        head= newNode;
        if (tail==null){
            tail=head;
        }
        numNodes++;
    }
    public void addLast(E e){
        Node newNode= new Node(e);
        if (tail==null){
            head=tail=newNode;
        } else {
            tail.next=newNode;
            tail=tail.next;
        }
        numNodes++;
    }
    public void add (int index, E e){
        if (index==0){
            addFist(e);
        } else if (index>=numNodes){
            addLast(e);
        } else {
            Node current= head;
            for (int i=1;i<index;i++){
                current=current.next;
            }
            Node temp=current.next;
            current.next=new Node(e);
            (current.next).next=temp;
            numNodes++;
        }
    }
    public E removeFist(){
        if (numNodes==0){
            throw new RuntimeException("Size of list is zero, cannot remove any element");
        } else {
            Node temp=head;
            head=head.next;
            numNodes--;
            if (head==null){
                tail=null;
            }
            return (E) temp.element;
        }
    }
    public E removeLast(){
        if (numNodes==0){
            throw new RuntimeException("Size of list is zero, cannot remove any element");
        } else if (numNodes==1){
            Node temp=head;
            head=tail=null;
            numNodes=0;
            return (E) temp.element;
        } else {
            Node current = head;
            for (int i=0; i<numNodes-2;i++){
                current =current.next;
            }
            Node temp=tail;
            tail=current;
            tail.next=null;
            numNodes--;
            return (E) temp.element;
        }
    }
    public E remove(int index){
        if (index<0||index>=numNodes){
            throw new RuntimeException("Size of list is zero, cannot remove");
        } else if (index==0){
            return removeFist();
        } else if (index==numNodes-1){
            return removeLast();
        } else {
            Node privious=head;
            for (int i=0;i<index;i++){
                privious=privious.next;
            }
            Node current = privious.next;
            privious.next=current.next;
            numNodes--;
            return (E) current.element;
        }
    }
    public int size(){
        return numNodes;
    }
    public void printList(){
        Node temp= head;
        while (temp!=null){
            System.out.println(temp.element);
            temp=temp.next;
        }
    }
    public E clone(E arr []){
        for (int i=0; i<arr.length;i++){
            addLast( arr[i]);
        }
        Node temp=tail;
      return (E) temp.element;
    }
    public boolean contain (E e){
        if (head.element==e){
            return true;
        } else {
            Node current= head;
            for (int i=1; i<numNodes-1;i++){
                current=current.next;
                if (current.element==e){
                    return true;
                }

            }
            return false;
        }

    }
    public void ensureCapacity( int minCapacity){
        if (numNodes==minCapacity){
            System.out.println(" Size of list over");
        }
    }
    public int indexOf(E e){
        int index =-1;
        if (head.element==e){
            return index=0;
        } else {
            Node current= head;
            for (int i=1;i<numNodes-1;i++){
                current=current.next;
                if (current.element==e){
                    index=i;
                }

            }
            return index;
        }

    }
    public void clear(){
       head=tail=null;
       numNodes=0;
    }
    public E get(int index){
        if (index<0&&index>=numNodes){
            throw new RuntimeException(" Have not index at "+ index);
        }else {
            if (index==0){
                return (E)head.element;
            } else {
                Node current= head;
                for (int i=1; i<=index;i++){
                    current=current.next;
                }
                return (E) current.element;
            }
        }

    }
}
