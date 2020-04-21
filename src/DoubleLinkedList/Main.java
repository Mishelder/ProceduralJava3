package DoubleLinkedList;

public class Main {

    public static void main(String[] args) {
        List list = new List();
        list.addFirstIter(0);
        list.addFirstIter(1);
        list.addFirstIter(2);
        list.addFirstIter(3);
        list.addFirstIter(4);
        list.addLastIter(2);
        list.addLastIter(2);
        list.addLastIter(2);
        list.print();

        list.removeIter(0);
        list.removeIter(4);
        list.printOpposite();
    }
}
