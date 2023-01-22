import java.util.*;
class Node {
    int val;
    Node left;
    Node right;

    public Node(int v) {
        this.val = v;
    }
}

public class ImplementationOfBinaryTree {

    // TRAVERSAL - RECURSIVE

    // public static void inOrderTraversal(Node h) {
    //     if (h == null)
    //         return;

    //     inOrderTraversal(h.left);
    //     System.out.println(h.val);
    //     inOrderTraversal(h.right);
    // }

    // public static void preOrderTraversal(Node h) {
    //     if (h == null)
    //         return;
    //     System.out.println(h.val);
    //     preOrderTraversal(h.left);
    //     preOrderTraversal(h.right);
    // }

    // public static void postOrderTraversal(Node h) {
    //     if (h == null)
    //         return;

    //     postOrderTraversal(h.left);
    //     postOrderTraversal(h.right);
    //     System.out.println(h.val);
    // }


    // TRAVERSAL - ITERATIVE


    public static void preOrderTraversal(Node root)
    {
        if(root == null)return;

        Stack<Node> st = new Stack<>();

        st.push(root);

        while(!st.isEmpty())
        {
            Node t = st.pop();

            System.out.println(t.val);
            if(t.right != null)st.push(t.right);
            if(t.left != null)st.push(t.left);
        }
    }

    public static void inOrder(Node root)
    {
        if(root == null)return ;

        Stack<Node> st = new Stack<>();

        Node t = root;

        while(true)
        {
            if(t!=null)
            {
                st.push(t);
                t = t.left;
            }
            else
            {
                if(st.isEmpty())break;

                Node p = st.pop();
                System.out.println(p.val);
                t = p.right;
            }
        }

    }

    // POST ORDER TRAVERSAL - USING 2 STACK


    public static void postOrder(Node root)
    {
        Stack<Node> st1 = new Stack<>();
        Stack<Node> st2 = new Stack<>();

        st1.push(root);

        while(!st1.isEmpty())
        {
            Node p = st1.pop();
            st2.push(p);

            if(p.left != null)st1.push(p.left);
            if(p.right != null)st1.push(p.right);

        }

        while(!st2.isEmpty())
        {
            System.out.println(st2.pop().val);
        }

    }









    public static List<List<Integer>> levelOrderTraversal(Node root)
    {
        Queue<Node> q = new LinkedList<>();
        List<List<Integer>> l = new LinkedList<>();

        if(root == null)return l;

        q.offer(root);

        while(!q.isEmpty())
        {
            int size = q.size();
            List<Integer> t = new LinkedList<>();
            for(int i = 0; i<size; i++)
            {
                if(q.peek().left != null)
                    q.offer(q.peek().left);
                
                if(q.peek().right != null)
                    q.offer(q.peek().right);

                t.add(q.poll().val);
            }

            l.add(new LinkedList<>(t));
        }
        return l;
    }


    public static void level(Node root)
    {
        Queue<Node> q = new LinkedList<>();

        q.add(root);

        while(!q.isEmpty())
        {
            Node t = q.poll();

            System.out.println(t.val);

            if(t.left != null)
                q.add(t.left);

            if(t.right != null)
                q.add(t.right);
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        level(root);
    }
}