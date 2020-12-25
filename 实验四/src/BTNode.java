public  class BTNode <T>{
    public T data;
    BTNode<T> lchild;
    BTNode<T> rchild;
    public BTNode(T da){
        data = da;
        lchild = null;
        rchild = null;
    }
}
