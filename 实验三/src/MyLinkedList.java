public class MyLinkedList<T> implements MyList<T>{
    private Node<T> front;
    private Node<T> rear;

    public MyLinkedList(){
        front = new Node<T>();
        front.next = null;
        rear = front;
    }

    @Override
    public boolean ListEmpty() {
        return front.next == null;
    }

    @Override
    public int ListLength() {
        int res = 0;
        Node<T> f = front;
        while(f.next != null) {
            res++;
            f = f.next;
        }
        return res;
    }

    @Override
    public T GetElem(int i) {
        Node<T> f = front;
        for(int o = 0; o <= i; o++){
            f = f.next;
        }
        return f.data;
    }

    @Override
    public int LocateElem(T e) {
        int res = -1, i = -1;
        Node<T> f = front;
        while(f.next != null) {
            i++;
            f = f.next;
            if(f.data == e){
                res = i;
                break;
            }
        }
        return res;
    }

    @Override
    public void ListInsert(int i, T e) {
        Node<T> f = front;
        for(int o = 0; o < i; o++) f = f.next;
        Node<T> n = new Node<>();
        if(f == rear) rear = n;
        n.data = e;
        n.next = f.next;
        f.next = n;
    }

    public void ListPrint(){
        if(ListEmpty()){
            System.out.println("The list is empty.");
            return;
        }
        Node<T> f = front;
        while(f.next != null) {
            System.out.println(f.next.data);
            f = f.next;
        }
    }

    @Override
    public T ListDelete(int i) {
        Node<T> f = front;
        for(int o = 0; o < i; o++) f = f.next;
        Node<T> n = f.next;
        if(n == rear) rear = f;
        f.next = f.next.next;
        return n.data;
    }

    @Override
    public void ListUpdate(int i, T e) {
        Node<T> f = front;
        for(int o = 0; o <= i; o++) f = f.next;
        f.data = e;
    }

    @Override
    public void ClearList() {
        front.next = null;
        rear = null;
    }

    public T GetHead(){
        if(front.next == null) return null;
        return front.next.data;
    }

    public T GetRear(){
        if(rear == null) return null;
        return rear.data;
    }
}
