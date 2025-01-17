class A extends Object{ // multi-level inheritanceff
    public A(){
        super(); // super is a method
        System.out.println("In A");
    }
    public A(int n){
        super();
        System.out.println("Int A"); // no print Int A because i am not calling this constructor or default constructor automatically called
    }
}
class B extends A{
    public B(){
        super();
        System.out.println("In B");
    }

    public B(int n){
        this(); // This will execute the the Constructor of a same class 
        System.out.println("Int B");
    }

}
public class This_super {
    public static void main(String[] args) {
        
       // B obj = new B(5); // suppose i am not passing any value so still give me output In B but 
       B obj = new B();                    // passing any value in object then output given Int B
    }
    
}



// parameterized constructor a constructor which take a value as a parameter
// every constructor in java has a method which is there even if you don't mantion okey and that method is super.
// super is a method (so by default every constructor the first statement is super and ever constructor)
// Super means call the constructor of a superclass.
// every class in java extends the object class