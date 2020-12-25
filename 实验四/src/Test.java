import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        BTree bt = new BTree();
        List<Integer> pre = new LinkedList<>();
        pre.add(1);
        pre.add(2);
        pre.add(5);
        pre.add(7);
        pre.add(6);
        pre.add(3);
        pre.add(4);
        pre.add(9);

        List<Integer> in = new LinkedList<>();
        in.add(5);
        in.add(2);
        in.add(7);
        in.add(6);
        in.add(1);
        in.add(4);
        in.add(3);
        in.add(9);


        bt.root = bt.createBTreeByPreAndIn(pre, in);
        System.out.println(bt.findLchildNode(bt.findNode(2)).data);
        System.out.println(bt.findRchildNode(bt.findNode(3)).data);

        ArrayList<BTNode<Integer>> preOrder = bt.preOrder();
        for (BTNode<Integer> o : preOrder) System.out.printf("%d ", o.data);
        System.out.println();

        ArrayList<BTNode<Integer>> inOrder = bt.inOrder();
        for(BTNode<Integer> x : inOrder) System.out.printf("%d ",x.data);
        System.out.println();

        ArrayList<BTNode<Integer>> postOrder = bt.postOrder();
        for(BTNode<Integer> x : postOrder) System.out.printf("%d ",x.data);
        System.out.println();

        ArrayList<BTNode<Integer>> levelOrder = bt.levelOrder();
        for(BTNode<Integer> x: levelOrder) System.out.printf("%d ",x.data);
        System.out.println();
    }
}
