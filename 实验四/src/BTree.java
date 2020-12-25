import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class BTree<T> {

    public BTNode<T> root;

    public BTNode<T> createBTreeByPreAndIn(List<T> preOrder, List<T> inOrder){
        if(preOrder.size() == 0) return null;
        BTNode<T> node = new BTNode<>(preOrder.get(0));
        if(preOrder.size() == 1) return node;
        int index = inOrder.indexOf(node.data);
        node.lchild = createBTreeByPreAndIn(preOrder.subList(1, index + 1), inOrder.subList(0, index));
        node.rchild = createBTreeByPreAndIn(preOrder.subList(index + 1, preOrder.size()), inOrder.subList(index + 1, inOrder.size()));
        return node;
    }

    public BTNode<T> createBTreeByInAndPost(List<T> inOrder, List<T> postOrder, int size){
        if(postOrder.size() == 0) return null;
        BTNode<T> node = new BTNode<>(postOrder.get(postOrder.size() - 1));
        if(postOrder.size() == 1) return node;
        int index = inOrder.indexOf(node.data);
        node.lchild = createBTreeByPreAndIn(inOrder.subList(0, index),  postOrder.subList(0, index));
        node.rchild = createBTreeByPreAndIn( inOrder.subList(index + 1, inOrder.size()), postOrder.subList(index, postOrder.size() - 1));
        return node;
    }


    public void destroyBTree(){
        if(root == null) return;
        dfsAndDestroyTree(root);
        root = null;
    }

    private void dfsAndDestroyTree(BTNode<T> p){
        if(p.lchild != null) {
            dfsAndDestroyTree(p.lchild);
            p.lchild = null;
        }
        if(p.rchild != null) {
            dfsAndDestroyTree(p.rchild);
            p.rchild = null;
        }
    }

    public BTNode<T> findNode(T x){
        if(root == null) return null;
        return dfsAndGetNode(root, x);
    }

    private BTNode<T> dfsAndGetNode(BTNode<T> p, T x){
        if(p.data.equals(x)) return p;
        BTNode<T> res = null;
        if(p.lchild != null) res = dfsAndGetNode(p.lchild, x);
        if(res == null && p.rchild != null) res = dfsAndGetNode(p.rchild, x);
        return res;
    }

    public BTNode<T> findLchildNode(BTNode<T> p){
        if(p == null) return null;
        return p.lchild;
    }

    public BTNode<T> findRchildNode(BTNode<T> p){
        if(p == null) return null;
        return p.rchild;
    }

    public int getBTHight(){
        if(root == null) return 0;
        return dfsAndGetHeight(root, 0, -1);
    }

    private int dfsAndGetHeight(BTNode<T> p, int height, int maxx){
        height++;
        if(p.lchild != null) maxx = Math.max(dfsAndGetHeight(p.lchild, height, maxx), maxx);
        if(p.rchild != null) maxx = Math.max(dfsAndGetHeight(p.rchild, height, maxx), maxx);
        maxx = Math.max(maxx, height);
        return maxx;
    }


    public ArrayList<BTNode<T>> preOrder(){
        ArrayList<BTNode<T>> res = new ArrayList<>();
        if(root == null) return null;
        preOrderDfs(root, res);
        return res;
    }

    private void preOrderDfs(BTNode<T> p, ArrayList<BTNode<T>> res){
        res.add(p);
        if(p.lchild != null) preOrderDfs(p.lchild, res);
        if(p.rchild != null) preOrderDfs(p.rchild, res);
    }

    public ArrayList<BTNode<T>> inOrder(){
        ArrayList<BTNode<T>> res = new ArrayList<>();
        if(root == null) return null;
        inOrderDfs(root, res);
        return res;
    }

    private void inOrderDfs(BTNode<T> p, ArrayList<BTNode<T>> res){

        if(p.lchild != null) inOrderDfs(p.lchild, res);
        res.add(p);
        if(p.rchild != null) inOrderDfs(p.rchild, res);
    }

    public ArrayList<BTNode<T>> postOrder(){
        ArrayList<BTNode<T>> res = new ArrayList<>();
        if(root == null) return null;
        postOrderDfs(root, res);
        return res;
    }

    private void postOrderDfs(BTNode<T> p, ArrayList<BTNode<T>> res){

        if(p.lchild != null) postOrderDfs(p.lchild, res);

        if(p.rchild != null) postOrderDfs(p.rchild, res);
        res.add(p);
    }

    public ArrayList<BTNode<T>> levelOrder(){
        ArrayList<BTNode<T>> res = new ArrayList<>();
        LinkedList<BTNode<T>> queue = new LinkedList<>();
        if(root == null) return null;
        queue.add(root);
        res.add(root);
        while(!queue.isEmpty()){
            BTNode<T> node = queue.poll();
            if(node.lchild != null) {
                queue.add(node.lchild);
                res.add(node.lchild);
            }
            if(node.rchild != null){
                queue.add(node.rchild);
                res.add(node.rchild);
            }
        }
        return res;
    }
}
