package Practice;

import java.util.Stack;

class Node {
    int val;
    Node left;
    Node right;

    public Node(int v) {
        this.val = v;
    }
}

public class Inorder {

    public static void inorderTraversal(Node root)
    {
        if(root == null)return;

        Stack<Node> st = new Stack<>();

        st.push(root);

        while(!st.isEmpty())
        {
            Node t = st.pop();

            System.out.print(t.val+" ");

            if(t.right != null)
                st.push(t.right);
            if(t.left != null)
                st.push(t.left);
        }

    }
    public static void main(String []args)
    {
        Node n = new Node(1);
        n.left = new Node(2);
        n.right = new Node(3);
        n.left.left = new Node(4);
        n.left.right = new Node(5);
        n.right.left = new Node(6);
        n.right.right = new Node(7);
        inorderTraversal(n);
        

    }
}
