public class BinarySearchTree<T extends Comparable<T>> {
    Node<T> root;

    /*--------- Insert new nodes in BST -------------*/
    public Node<T> insertKey(Node<T> root, T val) {
        if(root == null) 
            return new Node<>(val);

        if(val.compareTo(root.val) < 0)
            root.left = insertKey(root.left, val);
        else 
            root.right = insertKey(root.right, val);        
        return root;
    }

    /*----------------Delete key int bst--------------*/
    public Node<T> deleteKey(Node<T> root,T key){
        if(root==null)
            return root;
        if(key.compareTo(root.val)<0)
            root.left=deleteKey(root.left, key);
        else if(key.compareTo(root.val)>0)
            root.right=deleteKey(root.right, key);
        else{
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            else{
                root.val=inorderSuccessor(root.right);
                root.right=deleteKey(root.right, key);
            }
        }        
        return root;
    }

    public T inorderSuccessor(Node<T> root){
        while(root.left!=null)
            root = root.left;
        return root.val;
    }

    /*----------------Search Element in Tree----------*/
    public Node<T> searchElemnt(Node<T> root,T key){
        if(root==null||root.val==key){
            return root;
        }
        if(key.compareTo(root.val)<0)
            return searchElemnt(root.left, key);
        return searchElemnt(root.right, key);
    }

    /*-----------------Print BST Tree ---------------*/
    final int COUNT = 10;
    public void printRoot(Node<T> root,int space){
        if(root==null)
            return;
        space += COUNT; 
        printRoot(root.right,space);
        System.out.print("\n"); 
        for (int i = COUNT; i < space; i++) 
            System.out.print(" "); 
        System.out.print(root.val + "\n"); 
        printRoot(root.left,space);
        return;
    }

    /*-----------Max and Min val of bst---------*/
    public Node<T> getMin(Node<T> root) {
        while (root.left != null) root = root.left;
        return root;
    }

    public Node<T> getMax(Node<T> root) {
        while (root.right != null) root = root.right;
        return root;
    }

    /*----------Height of BST----------------*/
    public int maxHeight=0;
    public int findHeight(Node<T> root,int height){
        if(root==null){
            maxHeight = Math.max(maxHeight,height);
            return maxHeight;
        }
        findHeight(root.left,height+1);
        findHeight(root.right,height+1);
        return maxHeight;
    }


}
