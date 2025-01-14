class A{

    public A(){
        System.out.println("Cerated object");
    }
    public void show(){
        System.out.println("In a show");
    }
}

public class Anonymous_object {
    public static void main(String[] args) {
        // A obj = new A();
        // obj.show();

        new A(); // Anonymous object
        new A().show();
        
    }
    
}
