
// // STATIC BLOCK
// class StaticBlock
// {
//     static int a = 10;
//     static int b;

//     // Static block call on class load time
//     static{
//         System.out.println("I'm Static block");
//     }
// }

// // STATIC
// class A
// {
//     int age;
//     String name;

//     static void details()
//     {
//         // from static reference you cannot refer to not-static variable
//         // System.out.println(age);
//     }

//     void fun()
//     {
//         // from non-static you can use static context
//         details();
//     }
// }

// // Innner Class

// // nested class
// class OuterClass
// {
//     static class InnerClass{
//         String s;

//         InnerClass(String s)
//         {

//             this.s = s;
//         }
//     }
// }

// // method inner class

// class MethodOuterClass
// {
//     public void fun()
//     {
//         class MethodInnerClass{
//             public void f(){
//                 System.out.println("SOMU SAXENA");
//             }
//         }

//         MethodInnerClass mc = new MethodInnerClass();
//         mc.f();
//     }
// }

// public class Chapter2 {
    
//     public static void main(String []args)
//     {
//         // StaticBlock sb1 = new StaticBlock();
//         // StaticBlock sb2 = new StaticBlock();

        
//         // OuterClass.InnerClass ic = new OuterClass.InnerClass("SOMU SAXENA");

//         // System.out.println(ic.s);

//         MethodOuterClass mc = new MethodOuterClass();
//         mc.fun();
//     }
// }
