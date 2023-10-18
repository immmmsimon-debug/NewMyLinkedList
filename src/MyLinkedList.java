public class MyLinkedList<T>{
    private MyListNode<T> front;
    private MyListNode<T> end;

    public MyLinkedList(){
        front=null;
        end=null;
    }

    public void addToEnd(T data){
        //the list empty
        if(front == null){
            front = new MyListNode<T>(data);//add data to front of list
            end = front;// end and front are the same, only one thing in list
        }
        else {//the list is not empty
            //first let's create a new node to add
            MyListNode<T> nodeToAdd = new MyListNode<T>(data);
            //point the new node to the front
            end.setNext(nodeToAdd);
            //change front ot point to the new node
            end = nodeToAdd;
        }
    }

    public T removeFront(){
        if(front != null) {
           front = front.getNext();
        }
        return front.getData();
    }


    public T removeEnd() {
        MyListNode<T> current = front;
        while (current != null) {
            if (current.getNext() == end) {
                break;
            }
            current = current.getNext();
            // fix curreenyt
        }
        // current = prev
        end = current;
        return end.getData();
    }
    public void addToFront(T data){
        //the list empty
        if(front == null){
            front = new MyListNode<T>(data);//add data to front of list
            end = front;// end and front are the same, only one thing in list
        }
        else {//the list is not empty
            //first let's create a new node to add
            MyListNode<T> nodeToAdd = new MyListNode<T>(data);
            //point the new node to the front
            nodeToAdd.setNext(front);
            //change front ot point to the new node
            front = nodeToAdd;
        }
    }
    public String toString(){
        String output = "";

        MyListNode<T> current = front;
        while(current != null){
            output += current.getData() + "->";
            current = current.getNext();
        }
        output += "null";
        return output;
    }
}
