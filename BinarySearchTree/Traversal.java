import java.util.LinkedList;
import java.util.Queue;

public class Traversal<T extends Comparable<T>> {
    
    /*---------Pre Order Traversal -----------*/
    public void preOrderTraversal(Node<T> root){
        if(root==null)
            return;
        System.out.println(root.val);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    /*----------InOrder Traversal------------*/
    public void inOrderTraversal(Node<T> root){
        if(root==null)
            return;
        inOrderTraversal(root.left);
        System.out.println(root.val);
        inOrderTraversal(root.right);
    }

    /*----------Post OrderTraversal---------*/
    public void postOrderTraversal(Node<T> root){
        if(root==null)
            return;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.println(root.val);
    }

    /*-----------Level Order Traversal--------*/
    public void levelOrderTraversal(Node<T> root){
        final Queue<Node<T>> queue = new LinkedList<Node<T>>();
        queue.add(root);

        while (!queue.isEmpty()){
            Node<T> temp = queue.poll();
            System.out.print(temp.val + " ");
            if (temp.left!=null) 
                queue.add(temp.left);
            if (temp.right!=null) 
                queue.add(temp.right);
        }

    }
}
