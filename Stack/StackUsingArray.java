public class StackUsingArray
{
    int a[];
    int top = -1;

    public StackUsingArray(int size)
    {
        this.a = new int[size];
    }
    public void push(int val)
    {
        if(top == a.length)
            return;
        top++;
        a[top] = val;
    }
    public int pop()
    {
        if(top == -1)
            return top;
        int val = a[top];
        a[top] = 0;
        top--;
        return val;
    }

    public void display()
    {
        for(int i = top; i >= 0; i--)
        {
            System.out.println(a[i]);
        }
    }
    public static void main(String []args)
    {
        StackUsingArray s = new StackUsingArray(5);
        s.push(5);
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        s.display();
        System.out.println();
        System.out.println(s.pop());
        System.out.println();
        s.display();
    }
}