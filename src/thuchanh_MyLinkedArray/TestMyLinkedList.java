package thuchanh_MyLinkedArray;

public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING  =/=/=/=/");
        MyLinkedList ll= new MyLinkedList(10);
        ll.addFist(11);
        ll.addFist(12);
        ll.addFist(13);
        ll.add(4,9);
        ll.add(4,9);
        ll.printList();//
    }

}
