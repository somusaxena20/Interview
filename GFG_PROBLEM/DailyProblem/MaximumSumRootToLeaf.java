class Node 
{
    int data;
    Node lChild;
    Node rChild;

    Node(int val)
    {
        this.data = val;
        this.lChild = null;
        this.rChild = null;
    }
}
public class MaximumSumRootToLeaf
{
    public static int maxPathSum(Node root)
    {
        //code here
        
        if(root == null)return 0;

        int left = 0;
        int right = 0;
        if(root.lChild != null)
        {
            left = root.data + maxPathSum(root.lChild);
        }
        if(root.rChild != null)
        {
            right = root.data + maxPathSum(root.rChild);
        }
        return Math.max(left, right);
    }

    public static void main(String []args)
    {
        Node root = new Node(10);
        root.lChild = new Node(-2);
        root.rChild = new Node(7);
        root.lChild.lChild = new Node(8);
        root.lChild.rChild = new Node(-4);
        System.out.println(maxPathSum(root));
    }
}