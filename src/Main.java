public class Main {
    public static void main(String[] args) {
        System.out.println("LinkedList Simulation:");

        LinkedList linkedList=new LinkedList();

        linkedList.add(56);
        linkedList.add(30);
        linkedList.add(70);
        linkedList.displayNode();

        linkedList.enterDataAtPositon(30,40);
        linkedList.displayNode();

    }

}
