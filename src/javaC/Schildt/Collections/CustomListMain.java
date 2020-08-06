package javaC.Schildt.Collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class CustomListMain {
    public static void main(String[] args) {


       CustomList<String> customList= new CustomLinkedList<>();
        customList.add("Arpine");
        customList.add("David");
        customList.add("Hayastan");
        customList.add("Hello");

//        System.out.println(customLinkedList.get(0));
//        System.out.println(customLinkedList.get(1));

        for (int i = 0; i < customList.size(); i++) {
//            System.out.println(customLinkedList.get(i));
        }
        System.out.println(customList);

        customList.set("Tsoghik",1);
        System.out.println(customList);

        customList.remove(2);
        System.out.println(customList);

//CustomArrayList customArrayList = new CustomArrayList();
//
//        customArrayList.add("Anna");
//        customArrayList.add("Karen");
//        customArrayList.add("Elen");
//        customArrayList.add("Sveta");
//        System.out.println(customArrayList);
//
//
//        customArrayList.remove(3);
//        System.out.println(customArrayList);
//
//
//
//        CustomQueue customQueue = new CustomLinkedList();
//        customQueue.add(57);
//        customQueue.add(61);
//        customQueue.add(11);
//
//
//        System.out.println(customQueue.poll());
//        System.out.println(customQueue);
//
//        customQueue.add(15);
//        System.out.println(customQueue);
//
//        System.out.println(customQueue.peek());
//
//        System.out.println(customQueue);
//
//
//
//
//
//
//        CustomLinkedList customLinkedList = new CustomLinkedList();
//        customLinkedList.add(57);
//        customLinkedList.add(61);
//        customLinkedList.add(11);
//
//        System.out.println(customLinkedList.poll());
//
//        System.out.println(customLinkedList);
//
//
//
//
//        SortedSet<Integer> sortedSet = new TreeSet<>();
//        sortedSet.add(66);
//        sortedSet.add(51);
//        sortedSet.add(45);
//        sortedSet.add(99);
//        System.out.println(sortedSet);
//
//
//        SortedSet<CustomElement> sortedSet1 = new TreeSet<>(new CustomElementComparator());
//        sortedSet1.add(new CustomElement("Asas",10));
//        sortedSet1.add(new CustomElement("as",7));
//        System.out.println(sortedSet1);


    }
}
