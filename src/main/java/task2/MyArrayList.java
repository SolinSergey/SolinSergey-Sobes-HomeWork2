package task2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyArrayList {
    int[] list;
    private int size;
    private int capacity;

    public MyArrayList() {
        this.list = new int[10];
        System.out.println(Arrays.toString(list));
        this.size = 0;
        this.capacity = list.length;
    }

    public int size() {
        return size;
    }

    public int capacity() {
        return capacity;
    }

    public void resizeList(){
        int[] newArray = new int[capacity * 2];
        System.arraycopy(list, 0, newArray, 0, list.length);
        list = newArray;
        capacity = list.length;
    }

    public void add(int value) {
        if (size == capacity) {
            resizeList();
            size++;
            list[size - 1] = value;
        } else {
            size++;
            list[size - 1] = value;
        }
    }

    public void add(int position, int value){
        if (position>=0 && position<size-1){
            if (size==capacity){
                resizeList();
            }
            int[] newList=new int[capacity];
            System.arraycopy(list,position,newList,position+1,size-position);
            list[position]=value;
            System.arraycopy(newList,position+1,list,position+1,size-position);
            size++;
        }else if (position==size-1){
            if (size==capacity){
                resizeList();
            }
            list[position+1]=list[position];
            list[position]=value;
            size++;
        }
    }

    public int get(int position) {
        return list[position];
    }

    public void remove(int position) {
        int[] newArray = new int[capacity];
        if (size>0 && position<=size-1){
            if (position == 0) {
                System.arraycopy(list, 1, newArray, 0, size);
                size--;
            }else if(position==(size-1)){
                System.arraycopy(list,0,newArray,0,size-1);
                size--;
            }
            else if(position>0 && position<size-1) {
                System.arraycopy(list,0,newArray,0,position);
                System.arraycopy(list,position+1,newArray,position,size-position-1);
                size--;
            }
            list=newArray;
        }
    }

    public void set(int position, int value){
        if (position<size){
            list[position]=value;
        }
    }

    @Override
    public String toString() {
        String s = "MyArrayList[";
        for (int i = 0; i < list.length; i++) {
            if (i != list.length - 1) {
                s = s + list[i] + ", ";
            } else {
                s = s + list[i];
            }
        }
        s = s + "], size=" + size + ", capacity=" + capacity;
        return s;
    }
}
