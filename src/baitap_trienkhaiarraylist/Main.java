package baitap_trienkhaiarraylist;

public class Main {
    public static void main(String[] args) {
    MyList<Integer> list= new MyList<Integer>();
        System.out.println(list.size());
   list.add(1);

   list.add(2);

   list.add(3);

   list.add(4);

   list.add(1,100);
        System.out.println("Size "+list.size());
        for (int i=0; i<list.size();i++){
            System.out.println("Element at "+i+" is "+list.get(i));
        }
        System.out.println("After Remove at element 3 with " +list.get(3) );
        list.remove(3);

        for (int i=0; i<list.size();i++){
            System.out.println("Element at "+i+" is "+list.get(i));
        }
        //Check content
        System.out.println(list.contains(2));
        System.out.println(list.contains(100));
        System.out.println(list.contains(3));
        //Check indexOf
        System.out.println(list.indexOf(4));
        //Check clear
        list.clear();
        System.out.println(" size " + list.size());
        for (int i=0; i<list.size();i++){
            System.out.println("Element at "+i+" is "+list.get(i));
        }

    }
}
