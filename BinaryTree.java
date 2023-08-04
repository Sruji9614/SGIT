class TreeNode 
{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) 
    {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTree 
{
    public static TreeNode createTree() 
    {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        return root;
    }
    public static TreeNode copyTree(TreeNode originalRoot) 
    {
        if (originalRoot == null) 
        {
            return null;
        }
        TreeNode newRoot = new TreeNode(originalRoot.val);
        newRoot.left = copyTree(originalRoot.left);
        newRoot.right = copyTree(originalRoot.right);
        return newRoot;
    }

    public static void main(String[] args) 
    {
        TreeNode originalTree = createTree();
        TreeNode copiedTree = copyTree(originalTree);
        System.out.println("Values of nodes in the copied tree:");
        printInOrder(copiedTree);
    }

    public static void printInOrder(TreeNode root) 
    {
        if (root != null) 
        {
            printInOrder(root.left);
            System.out.print(root.val + " ");
            printInOrder(root.right);
        }
    }
}