import java.util.Arrays;
import java.util.Stack;
// https://leetcode.com/problems/next-greater-element-i/

public class NextGreaterElement1
{
    // APPROACH 1

    // public static int[] nextGreaterElement(int[] a, int[] b) {
    //     for(int i = 0; i<a.length; i++)
    //     {
    //         int target = a[i];
    //         int j = 0;
    //         while(j < b.length && a[i] != b[j])
    //         {
    //             j++;
    //         }
    //         a[i] = -1;

    //         while(j < b.length)
    //         {
    //             if(target < b[j])
    //             {
    //                 a[i] = b[j];
    //                 break;
    //             }
    //             j++;
    //         }
            
    //     }
    //     return a;
    // }

    public static int[] nextGreaterElement(int[] a, int[] b) {
        int []diff = new int[b.length];
        int []ng = new int[a.length];
        Stack<Integer>st = new Stack<>();

        for(int i = b.length-1; i>=0; i--)
        {
            if(st.isEmpty())
            {
                diff[i] = -1;
                st.push(b[i]);
            }
            else if(b[i] >= st.peek())
            {
                while(!st.isEmpty() && b[i] >= st.peek())
                {
                    st.pop();
                }

                if(st.isEmpty())
                {
                    diff[i] = -1;
                    st.push(b[i]);
                }
                else
                {
                    diff[i] = st.peek();
                    st.push(b[i]);
                }
            }
            else
            {
                diff[i] = st.peek();
                st.push(b[i]);
            }
        }
        
        for(int i = 0;i<a.length; i++)
        {
            for(int j = 0; j<b.length; j++)
            {
                if(a[i] == b[j])
                {
                    ng[i] = diff[j];
                }
            }
        }
        return ng;

    }

    public static void main(String []args)
    {
        int a[] = {2,4};
        int []b = {1,2,3,4};
        // nextGreaterElement(a,b);
        System.out.println(Arrays.toString(nextGreaterElement(a,b)));
    }
}