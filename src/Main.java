public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.addToFront(5);
        list.addToFront(10);
        list.addToEnd(20);
        list.addToFront(15);
        list.removeFront();
        list.removeEnd();
        System.out.println(list);
    }
}