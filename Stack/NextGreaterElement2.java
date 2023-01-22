import java.util.Stack;

// https://leetcode.com/problems/next-greater-element-ii/
public class NextGreaterElement2 {
    public static int[] nextGreaterElements(int[] a) {
        int []diff = new int[a.length];
        int n = a.length;
        Stack<Integer> st = new Stack<>();
        for(int i = 2*n-1; i>=0; i--)
        {
            while(!st.isEmpty() && st.peek() <= a[i%n])
            {
                st.pop();
            }
            if(i < n)
            {
                if(!st.isEmpty())
                {
                    diff[i] = st.peek();
                }
                else
                {
                    diff[i] = -1;
                }
            }
            st.push(a[i%n]);
        }
        return diff;
    }
    public static void main(String []args)
    {
        int []a = {1,2,1};
        System.out.println(java.util.Arrays.toString(nextGreaterElements(a)));
    }
}
