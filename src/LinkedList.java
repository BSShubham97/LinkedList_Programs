public class LinkedList {
    Node head;
    Node tail;
    Node dataNode;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            this.head = newNode;
            this.tail = newNode;
            this.dataNode = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }


    /**
     *
     */
    public void displayNode(){
        Node currentNode = head;
        if(head==null){
            System.out.println("Empty Linklist");
        }else{
            System.out.println("Nodes of Linklist: ");
            while(currentNode!=null){
                System.out.print(currentNode.data+" ");
                currentNode=currentNode.next;
            }
            System.out.println();

        }
    }

}


