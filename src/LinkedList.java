public class LinkedList {
    Node head;
    Node tail;
    Node dataNode;


    /**
     * Add data into a LinkedList
     * @param data The key value of a New Node
     */
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
     * To display all the data from nodes in a LinkedList
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

    /**
     * To add node to the front of a previous node
     * @param data The key value of a Node
     */
    public void addDataToFront(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            this.head = newNode;
            this.tail = newNode;
            this.dataNode = newNode;
        } else {

            newNode.next = head;
            head=newNode;
        }

    }

    /**
     * UC-3 : Add 30 and 70 to 56
     * Method append() Add data node to back of a previous node
     * @param data The key value of a Node
     * @return
     */
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            this.head = newNode;
            this.tail = newNode;
            this.dataNode = newNode;
        } else {
            Node tempNode = head;
            while (tempNode.next != null) {
                tempNode = tempNode.next;
            }
            tempNode.next = newNode;
        }

    }


}




