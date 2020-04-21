package LinkedList;

public class List {

    private Node head;

    public List(){
        this.head = null;
    }

    void addFirst(int num){
        Node node = new Node(num);
        if(this.head==null) {
            head = node;
            return;
        }else{
            node.next = this.head;
            this.head = node;
        }
    }

    void addBackIter(int num){
        Node newNode = new Node(num);
        if(this.head==null) {
            head = newNode;
            return;
        }
        Node pointer = head;
        while(pointer.next!=null)
           pointer = pointer.next;
        pointer.next = newNode;
    }

    void addBackR(int num){
        Node tmp = new Node(num);
        if(head==null) {
            head = tmp;
            return;
        }
         add(this.head).next=tmp;
    }

    Node add(Node head){
        return head.next==null? head:add(head.next);
    }

    void removeIter(int index){
        if(index==0) {
            this.head = this.head.next;
            return;
        }
        else if(index==lengthR(this.head)-1){
            Node tmp = this.head;
            while(tmp.next.next !=null)
                tmp = tmp.next;
            tmp.next =null;
            return;
        }
        int i=1;
        Node second = this.head;
        while(i!=index&&second!=null){
            second = second.next;
            i++;
        }
        second.next = second.next.next;

    }

    void removeR(int index){
        if(index==0) {
            this.head = this.head.next;
            return;
        }
        int tmpIndex=1;
        Node tmp = remove(this.head,index ,tmpIndex) ;
        tmp.next = tmp.next.next;
    }

    Node remove(Node head,int index,int tmpIndex){
        return (head.next.next==null)||(index==tmpIndex)? head: remove(head.next,index,++tmpIndex);
    }

    int lengthR(Node head){
        return head==null? 0:1+lengthR(head.next);
    }

    int lengthIter(){
        Node tmp = this.head;
        int length=0;
        while(tmp!=null){
            tmp=tmp.next;
            length++;
        }
        return length;
    }

    int maxR(Node head){
        return (head==null)?0:Math.max(head.data,maxR(head.next));
    }

    int maxIter(){
        Node node = this.head;
        if(head ==null)
            return 0;
        int tmp= head.data;
        while(node.next!=null){
            tmp = Math.max(tmp,node.next.data);
            node = node.next;
        }
        return tmp;
    }

    int sumR(Node head){
        return (head==null)?0: head.data+sumR(head.next);
    }

    int sumIter(){
        Node node = this.head;
        if(head ==null)
            return 0;
        int tmp= head.data;
        while(node.next!=null){
            tmp +=node.next.data;
            node = node.next;
        }
        return tmp;
    }

    void print(){
        Node tmp = this.head;
        System.out.println();
        while(tmp!=null){
            System.out.print(tmp.data+" ");
            tmp= tmp.next;
        }
    }

    public Node getHead() {
        return head;
    }
}
