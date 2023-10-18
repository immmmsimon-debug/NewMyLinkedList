public class MyListNode<T> {

    T data;
    MyListNode<T> next;

    public  MyListNode(T data){
        this.data = data;
        this.next = null;
    }
    public MyListNode(T data, MyListNode<T> next){
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public MyListNode<T> getNext() {
        return next;
    }

    public void setNext(MyListNode<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "MyListNode{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
