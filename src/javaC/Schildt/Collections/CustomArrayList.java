package javaC.Schildt.Collections;


import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
    private T[] values;
    private int size;

    public CustomArrayList() {
        this(10);

    }

    public CustomArrayList(int capacity) {
        values = (T[]) new Object[capacity];
        size = 0;

    }


    public void add(T value) {

        if (size == values.length) {
            values = Arrays.copyOf(values, ((values.length * 3) / 2) + 1);
        }

        values[size] = value;
        size++;
    }

    public void set(T value, int number) {
        if (size == values.length) {
            values = Arrays.copyOf(values, ((values.length * 3) / 2) + 1);
        }
        values[number] = value;
    }

    public void remove(int number) {
        if (number >= size) {
            throw new IndexOutOfBoundsException("Size is:" + size);

        }
        for (int i = number; i < size; i++) {
            values[i] = values[i + 1];
        }
        size--;
    }


    public int size() {
        return size;
    }

    public String toString() {
        String returnable = "CustomArrayList[ ";

        for (int i = 0; i < size; i++) {
            if (i == size - 1) {
                returnable += this.get(i);
            } else {
                returnable += this.get(i) + ", ";
            }

        }
        returnable += " ]";
        return returnable;
    }


    public T get(int number) {
        if (number >= size) {
            throw new IndexOutOfBoundsException("Size is:" + size);
        }
        return values[number];


    }

}
