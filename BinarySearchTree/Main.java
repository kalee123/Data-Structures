public class Main{
    public static void main(String[] args) {
        BinarySearchTree<Integer> bst=new BinarySearchTree<>();
        Traversal<Integer> trav=new Traversal<>();
        Node<Integer> root = null;
        int []arr=new int[]{2,3,10,8,101};
        
        /*-----Insert in bst------*/
        for(int i=0;i<5;i++){
            root = bst.insertKey(root, (Integer)arr[i]);
        }

        /*----Print Bst----------*/
        bst.printRoot(root,0);
        
        /*------Search element------*/
        System.out.println(bst.searchElemnt(root, 8).val);

        /*-------Delete Element-----*/
        root=bst.deleteKey(root, 8);

        /*-------Tree Taversals -----*/
        trav.preOrderTraversal(root);
        trav.inOrderTraversal(root);
        trav.postOrderTraversal(root);
        trav.levelOrderTraversal(root);

    }
}