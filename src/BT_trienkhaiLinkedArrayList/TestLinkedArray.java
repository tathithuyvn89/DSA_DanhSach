package BT_trienkhaiLinkedArrayList;

import thuchanh_MyLinkedArray.MyLinkedList;

public class TestLinkedArray {
    public static void main(String[] args) {
        MyLinkedList2 ll= new MyLinkedList2(10);
        ll.addFist(11);
        ll.addFist(12);
        ll.addFist(13);
        ll.add(4,9);
        ll.add(5,9);
        ll.printList();
    }

}
