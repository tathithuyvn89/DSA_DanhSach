package thuchanh_trienkhaisimplelist;

public class MyListTest {
    public static void main(String[] args) {
        MyList1<Integer> listInterger= new MyList1<Integer>();
        listInterger.add(1);
        listInterger.add(2);
        listInterger.add(3);
        listInterger.add(3);
        listInterger.add(4);
        System.out.println(listInterger.get(0));
        System.out.println(listInterger.get(1));
        System.out.println(listInterger.get(2));
        System.out.println(listInterger.get(3));
        System.out.println(listInterger.get(4));
        System.out.println("===================");
        System.out.println("element 4: "+listInterger.get(4));
        System.out.println("element 1: "+listInterger.get(1));
        System.out.println("element 2: "+listInterger.get(2));
        System.out.println("element 3: "+listInterger.get(3));
        listInterger.get(-1);
        System.out.println("element -1: " + listInterger.get(-1));
    }
}
