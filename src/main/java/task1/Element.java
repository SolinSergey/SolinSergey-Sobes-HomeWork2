package task1;

public class Element <T>{
    T value;
    Element <T> next;
    Element(T d) {
        value = d;
        next=null;
    }
}
