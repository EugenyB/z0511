package main;

public class Stack<T> {

    private Object[] elements = new Object[1000];
    private int count = 0;

    public void push(T t) {
        elements[count] = t;
        count++;
    }

    public T pop() {
        count--;
        return (T) elements[count];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public T peek() {
        return (T) elements[count-1];
    }
}
