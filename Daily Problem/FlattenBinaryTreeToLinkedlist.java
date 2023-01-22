import java.util.*;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class FlattenBinaryTreeToLinkedlist {
    public void flatten(TreeNode root) {
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        TreeNode temp = new TreeNode(0);
        TreeNode a = temp;
        while(!st.isEmpty())
        {
            TreeNode t = st.pop();
            a.right = new TreeNode(t.val);
            if(t.right != null)
            {
                st.push(t.right);
            }
            if(t.left != null)
            {
                st.push(t.left);
            }
            a = a.right;
        }
        root = temp.right;
    }

    public void preOrder(TreeNode root)
    {

    }

    public static void main(String[] args) {
//         1
//     2        5
// 3      4          6

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = null;
        root.right.right = new TreeNode(6);
    }
}
