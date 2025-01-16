class A{
    public A(){
        System.out.println("In A");
    }
}
class B extends A{
    public B(){
        System.out.println("In B");
    }

}
public class This_super {
    public static void main(String[] args) {
        
        B obj = new B();
    }
    
}



// parameterized constructor a constructor which take a value as a parameter