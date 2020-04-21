package BT_trienkhaiLinkedArrayList;

import thuchanh_MyLinkedArray.MyLinkedList;

public class TestLinkedArray {
    public static void main(String[] args) throws Exception {
        MyLinkedList2 <Integer>ll= new MyLinkedList2();
        ll.addFist(2);
        ll.addFist(3);
        ll.addFist(5);
        ll.addLast(6);
        ll.addLast(7);
        ll.add(2,100);
        ll.printList();
        System.out.println("Size of list: "+ll.size());
        System.out.println("Check remove "+ ll.removeLast());
        ll.printList();
        System.out.println("Check remove at index= 3 (element=100)");
        ll.remove(3);
        ll.printList();
        System.out.println(ll.get(4));
//        System.out.println(ll.contain(100));
//        System.out.println(ll.indexOf(5));

//        System.out.println("====Clear===");
//        ll.clear();
//        ll.printList();

    }

}
