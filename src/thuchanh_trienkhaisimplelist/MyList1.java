package thuchanh_trienkhaisimplelist;

import baitap_trienkhaiarraylist.MyList;

import java.util.Arrays;

public class MyList1<E> {
    private int size=0;
    private static final int DEFAULT_CAPACITY=10;
    private Object elements[];
    public MyList1(){
        elements=new Object[DEFAULT_CAPACITY];
    }
    private void ensureCapacity(){
        int newSide= elements.length*2;
        elements= Arrays.copyOf(elements,newSide);
    }
    public void add (E e){
        if (size==elements.length){
            ensureCapacity();
        }
        elements[size++]=e;
    }
    public E get (int i){
        if (i>=size||i<0){
            throw new IndexOutOfBoundsException("Index: "+i+", size "+i);
        }
        return (E) elements[i];
    }
}
