
// 1. Inheritance

class A
{
    int l,b;

    A(int a, int b){
        this.l = a;
        this.b = b;
    }

    public void message()
    {
        System.out.println("Hello I'm class A");
    }
}

class B extends A{
    int h;

    B(int a, int b, int c)
    {
        super(a,b);
        this.h = c;
    }
    
    public void message()
    {
        
        System.out.println("Hello I'm class B "+super.l);
    }

    public void display()
    {
        System.out.println(this.l+" "+this.b+" "+this.h);
    }
    
}
class C extends B
{
    C()
    {
        super(10,20,30);
    }

    public void message()
    {
        // use to refer the parent class
        super.message();
    }
}



// 2. Ploymorphism

class Parent
{
    public void display()
    {
        System.out.println("DEFAULT MESSAGE : SOMU SAXENA");
    }

    public void display(String s)
    {
        System.out.println("ONE ARGUMENT MESSAGE : "+s);
    }

    public void display(String s, String s2)
    {
        System.out.println("TWO ARGUMENT MESSAGE : "+s+s2);
    }
}

class Child
{

}
public class Chapter3 {
    public static void main(String []args)
    {
        // B b = new B(10,20,30);
        // C a = new C();

        // a.message();
        // b.message();  
        
        Parent p = new Parent();
        p.display();
        p.display("SOMU");
        p.display("SOMU", "SAXENA");
    }
}
