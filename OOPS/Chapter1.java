// class A
// {
//     int ab = 10;
//     protected void finalize()
//     {
//         System.out.println("Object Destroyed");
//     }
// }
// public class Chapter1
// {
    
//     public static void main(String []args)
//     {
//         final A a = new A();


//         // FINALIZE METHOD 
//         // for(int i = 0; i<1000000; i++)
//         // {
//         //     a = new A();
//         // }

//         // If the object is final so you cannot change it's object
        
//         // a = new A();
//         a.ab = 20;
//         System.out.println(a.ab);
//     }
// }