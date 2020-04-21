package baitap_trienkhaiarraylist;

import java.util.Arrays;
import java.util.Collections;

public class MyList<E> {
    private int size=0;
    static final int DEFAULT_CAPACITY=10;
    private Object elements[];
    public MyList(){
        elements= new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements= Arrays.copyOf(elements,capacity);
    }
    public void add (E e){
        if (size==elements.length){
            ensureCapa();
        }
        elements[size++]=e;

    }
    private void ensureCapa(){
       int newSize= elements.length*2;
       elements=Arrays.copyOf(elements,newSize);
    }
    //1. Thêm 1 phần tử tại vị trí xác định vào mảng
   protected void add(int index,E e){
        if (size>=elements.length){
            ensureCapa();
        }
       for (int i=size-1;i>=index;i--){
           elements[i+1]=elements[i];

       }
       size++;
       elements[index]=e;
   }
    // Xóa 1 phần tử tại vị trí xác định khỏi mảng
    public E remove(int index){
        if (index<0||index>=size)
            throw new IndexOutOfBoundsException("index "+index+" out of bounds"+size);
        for ( int j=index;j<size-1;j++){
            elements[j]=elements[j+1];
            elements[size-1]=null;
            size--;
        }
        return (E) elements[index];

    }
    public E get (int i){
        if (i>=size||i<0){
            throw new IndexOutOfBoundsException("Index: "+i+", size "+i);
        }
        return (E) elements[i];
    }
    public int size(){
     return size;
    }
    public boolean contains(E e){
        for (int i=0; i<size;i++){
            if (e.equals(elements[i]))
                return true;
        }
        return false;
    }
//    public E clone(E e){
//        return (E) elements[int i];
//    }
    public int indexOf(E o){
        for (int i=0; i<size;i++){
            if (o.equals(elements[i])){
                return i;
            }
        }
        return -1;
    }

//    public boolean add (E e){
//        if (indexOf( E e)==-1){
//            return false;
//        }
//        return true;
//    }
    public void clear(){
        elements= new Object[DEFAULT_CAPACITY];
        size=0;
    }

}
