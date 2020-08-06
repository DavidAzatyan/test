package javaC.Schildt.Collections;
import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class CustomLinkedList<T> implements CustomList<T>, CustomQueue<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;
    private T[] values;


    public CustomLinkedList() {
        size = 0;
    }

    public T poll() {
        T temp = peek();
        if (size!=0){
            remove(0);
        } return temp;
    }


    public T peek(){
        if (size != 0) {
            return head.getValue();
        } else {
            throw new EmptyStackException();


        }
    }



    public void add(T value) {
        if (size == 0) {
            head = tail = new Node<>(value);
        } else {
            Node<T> temp = new Node<>(value);
            temp.setPrevious(tail);
            tail.setNext(temp);
            tail = temp;
        }
        size++;
    }


    public void set(T value, int number) {
        if (number >= size) {
            throw new IndexOutOfBoundsException("Size is:" + size);
        }
        Node<T> node = this.getNode(number);
        node.setValue(value);

    }


    public T get(int number) {
        if (number >= size) {
            throw new IndexOutOfBoundsException("Size is:" + size);
        }
        return this.getNode(number).getValue();
    }


    public void remove(int number) {
        if (number >= size) {
            throw new IndexOutOfBoundsException("Size is:" + size);
        } else if (number == 0) {
            head = head.getNext();
            head.setPrevious(null);
        } else if (number == size - 1) {
            tail = tail.getPrevious();
            tail.setNext(null);
        } else {
            Node<T> tmp = getNode(number);
            tmp.getNext().setPrevious(tmp.getPrevious());
            tmp.getPrevious().setNext(tmp.getNext());

        }

        size--;
    }

    private Node<T> getNode(int number) {
        Node<T> tmp = head;
        for (int i = 0; i < number; i++) {
            tmp = tmp.getNext();
        }
        return tmp;

    }


    public int size() {
        return size;
    }


    public String toString() {
        String returnable = "CustomLinkedList[ ";

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
}
