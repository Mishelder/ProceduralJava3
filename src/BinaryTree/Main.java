package BinaryTree;

public class Main {

    public static void main(String[] args) {
        TreeMap treeMap = new TreeMap();
        treeMap.addR(treeMap.root,21);
        treeMap.addR(treeMap.root,2);
        treeMap.addR(treeMap.root,6);
        treeMap.addR(treeMap.root,11);
        treeMap.addR(treeMap.root,15);
        treeMap.addR(treeMap.root,20);
        treeMap.addR(treeMap.root,18);
        treeMap.addR(treeMap.root,19);
        treeMap.addR(treeMap.root,3);
        treeMap.addR(treeMap.root,1);
        treeMap.addR(treeMap.root,4);
        System.out.println(treeMap.sizeR(treeMap.root));
        System.out.println(treeMap.heightR(treeMap.root));
        System.out.println(treeMap.sumR(treeMap.root));
        System.out.println(treeMap.maxR(treeMap.root));
        treeMap.printR(treeMap.root);
    }
}
