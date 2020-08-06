package javaC.Schildt.Collections;

public interface CustomList<T> {
    void add (T value);

    void set(T value, int number);

    T get(int number);

    void remove(int number);

    int size();

    String toString();
}
