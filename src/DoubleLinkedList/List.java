package DoubleLinkedList;

public class List {

    private DoubleNode head;
    private DoubleNode tail;

    public List(){
        head = null;
        tail = null;
    }

    public void addFirstIter(int num){
        DoubleNode newNode = new DoubleNode(num);
        if(this.head==null) {
            this.head = newNode;
            this.tail = newNode;
            return;
        }
        this.head.prev = newNode;
        newNode.next = this.head;
        this.head = newNode;
    }

    public void addLastIter(int num){
        DoubleNode newNode = new DoubleNode(num);
        if(this.head==null) {
            this.head = newNode;
            this.tail = newNode;
            return;
        }
        newNode.prev = this.tail;
        this.tail.next = newNode;
        this.tail = this.tail.next;
    }

    public void print(){
        DoubleNode tmp = this.head;
        System.out.println();
        while(tmp!=null){
            System.out.print(tmp.data+" ");
            tmp= tmp.next;
        }
    }

    public void removeIter(int index){

        if(this.head==null)
            return;

        if(index==0) {
            this.head = this.head.next;
            this.head.prev=null;
            return;
        }else if(index == lengthR(this.head)-1){
            this.tail = this.tail.prev;
            this.tail.next = null;
            return;
        }
        DoubleNode tmp = this.head;
        int tmpIndex=1;
        while(tmpIndex!=index&&tmp!=null){
            tmpIndex++;
            tmp=tmp.next;
        }
        tmp.next = tmp.next.next;
        tmp.next.prev = tmp;
    }

    public void printOpposite(){
        DoubleNode tmp = this.tail;
        System.out.println();
        while(tmp!=null){
            System.out.print(tmp.data+" ");
            tmp= tmp.prev;
        }
    }

    int lengthR(DoubleNode head){
        return head==null? 0:1+lengthR(head.next);
    }

    public DoubleNode getHead() {
        return head;
    }

    public DoubleNode getTail() {
        return tail;
    }
}
