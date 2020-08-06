package javaC.Schildt.Collections;

public interface CustomQueue<T>{


    T poll();
    T peek();

    void add(T value);

    void remove(int number);


}
