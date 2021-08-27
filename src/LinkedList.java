public class LinkedList {
    Node head = null;
    Node tail = null;
    Node dataNode;


    /**
     * Add data into a LinkedList
     *
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
    public void displayNode() {
        Node currentNode = head;
        if (head == null) {
            System.out.println("Empty Linklist");
        } else {
            System.out.println("Nodes of Linklist: ");
            while (currentNode != null) {
                System.out.print(currentNode.data + " ");
                currentNode = currentNode.next;
            }
            System.out.println();

        }
    }

    /**
     * To add node to the front of a previous node
     *
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
            head = newNode;
        }

    }

    /**
     * UC-3 : Add 30 and 70 to 56
     * Method append() Add data node to back of a previous node
     *
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

    /**
     * UC-4 To add a new node after a given previous node
     *
     * @param previousNode The node which comes before the new node to be added
     * @param data         New node key value
     */
    public void insertAfter(Node previousNode, int data) {
        Node newNode = new Node(data);

        if (head == null) {
            System.out.println("EMPTY LINKEDLIST");
        } else {
            newNode.next = previousNode.next;
            previousNode.next = newNode;
        }
    }

    /**
     * UC-5 To pop head of a Linked List
     */

    public void popHead() {
        if (head == null) {
            System.out.println("EMPTY LINKEDLIST");
        } else {
            head = head.next;
        }
    }

    /**
     * UC-6 To pop last node i.e Tail of a LinkedList
     */
    public void popTail() {
        if (head == null) {
            System.out.println("EMPTY LINKEDLIST");
        } else {
            if (head != tail) {
                Node current = head;
                while (current.next != tail) {
                    current = current.next;
                }
                tail = current;
                tail.next = null;
            }
        }
    }

    /**
     * UC-7 To search the node position of the entered data
     *
     * @param searchedData The value to be through the linkedlist to get its node position
     */
    public void dataPosition(int searchedData) {
        System.out.println("Data to be Searched : " + searchedData);
        int i = 1;
        boolean found = false;
        Node current = head;
        if (head == null) {
            System.out.println("Linked List is Empty");
        } else {
            while (current != null) {
                if (current.data == searchedData) {
                    found = true;
                    break;
                }
                i++;
                current = current.next;
            }
        }
        if (found == true)
            System.out.println("Found data at Node Position : " + i);
        else
            System.out.println("Not Found");
    }

    /**
     * UC-8 To add data at a given position of Node
     *
     * @param prevPositionOfInsertion The postion of at which you want to add data
     * @param dataToBeEntered         The key value to be added
     */
    public void enterDataAtPositon(int prevPositionOfInsertion, int dataToBeEntered) {
        Node newDataNode = new Node(dataToBeEntered);

        boolean found = false;
        Node current = head;

        if (head == null) {
            System.out.println("Linked List is Empty");
        } else {
            while (current != null) {
                if (current.data == prevPositionOfInsertion) {
                    found = true;

                    newDataNode.next = current.next;
                    current.next = newDataNode;

                    break;
                }
                current = current.next;
            }
        }
        if (found == true)
            System.out.println("Data Inserted");
        else
            System.out.println("Postion not found");
    }

    /**
     * UC-9 To delete the entered data from the LinkedList and give out the size
     *
     * @param thisDataToBeDeleted The data of node to be deleted
     */
    public void deleteThisData(int thisDataToBeDeleted) {
        Node current = head;
        Node previous = null;


        if (current.next != null && current.data == thisDataToBeDeleted) {
            head = current.next;
            return;
        }

        while (current.next != null && current.data != thisDataToBeDeleted) {

            previous = current;
            current = current.next;

        }
        if (current == null)
            System.out.println("Data not present");

        previous.next = current.next;

    }

    /**
     * To find the size of the LinkedList
     */
    public void size() {
        Node current = head;
        int i = 0;
        if (head == null) {
            System.out.println("Empty LinkedList");
        } else {
            while (current != null) {
                current = current.next;
                i++;
            }

        }
        System.out.println("Size of LinkedList  is: " + i);
    }


    /**
     * sortList() will sort nodes of the list in ascending order
     */

    public void sortList() {

        //Node current will point to head
        Node current = head, index = null;
        int temp;

        if (head == null) {
            return;
        } else {
            while (current != null) {
                //Node index will point to node next to current
                index = current.next;

                while (index != null) {
                    //If current node's data is greater than index's node data, swap the data between them 
                    if (current.data > index.data) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
        System.out.println("Sorted");
    }
}













