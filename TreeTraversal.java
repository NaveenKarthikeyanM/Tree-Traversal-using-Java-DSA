class TreeNode{
    int value;
    TreeNode left,right;
    TreeNode(int value){
        this.value=value;
        left=right=null;
    }
}
public class TreeTraversal {
    public void preorder(TreeNode node){
        if(node==null)
            return;
        System.out.print(node.value+" ");
        preorder(node.left);
        preorder(node.right);
    }
    public void postorder(TreeNode node){
        if(node==null)
            return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.value+" ");   
    }
    public void inorder(TreeNode node){
        if(node==null)
            return;
        inorder(node.left);
        System.out.print(node.value+" ");
        inorder(node.right);   
    }
    public static void main(String[] args) {
        TreeNode node=new TreeNode(4);
        node.left=new TreeNode(2);
        node.right=new TreeNode(5);  
        node.left.left=new TreeNode(3);
        node.left.left.right=new TreeNode(9);
        node.left.left.right.left=new TreeNode(1);
        node.right.left=new TreeNode(7);
        node.right.right=new TreeNode(6);
        node.right.right.left=new TreeNode(8);
        Traversal tree=new Traversal();
        System.out.println("Preorder Traversal :");
        tree.preorder(node);
        System.out.print("\n");
        System.out.println("Inorder Traversal :");
        tree.inorder(node);
        System.out.print("\n");
        System.out.println("Postorder Traversal :");
        tree.postorder(node);
    }
}
