public class CheckBalancedBinaryTree {
    public static boolean isBalanced(Node root) {
        return check(root) != 1;
    }

    public static int check(Node root)
    {
        if(root == null)return 0;

        int left = check(root.left);
        if(left == -1)return -1;

        int right = check(root.right);
        if(right == -1)return -1;

        if(Math.abs(left-right) > 1)return -1;

        return Math.max(left,right) + 1;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(isBalanced(root));
    }

}
