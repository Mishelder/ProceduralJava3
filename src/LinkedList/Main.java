package LinkedList;

public class Main {

    public static void main(String[] args) {
        List list = new List();
        list.addBackR(0);
        list.addBackR(1);
        list.addBackR(2);
        list.addBackR(3);
        list.addBackIter(4);
        list.addFirst(4);
        list.addBackIter(4);
        list.addFirst(4);
        list.addBackIter(55);
        list.addFirst(10);
        list.addBackIter(1115);
        list.addFirst(99);
        list.addFirst(5);
        list.addBackR(3);
        list.addBackR(3);
        list.print();
        list.removeR(list.lengthR(list.getHead())-1);
        list.removeR(0);
        list.removeR(6);
        list.print();
        System.out.println(list.lengthIter());
        System.out.println(list.lengthR(list.getHead()));
        System.out.println(list.maxR(list.getHead()));
        System.out.println(list.maxIter());
        System.out.println(list.sumR(list.getHead()));
        System.out.println(list.sumIter());
        list.print();
        list.removeIter(10);
        list.print();
    }
}
