class Mobile {
    String band; // band and price are instance variables
    int price;
    static String name; // static variable share the same value with other obhject

    static { // static block is used to initialize the static variable
        name = "Phone";
        System.out.println("In static block");
    }

    public Mobile() {
        band = "";
        price = 200;
        System.out.println("In constructor");
    }

    public void show() {
        System.out.println(band + " : " + price + " : " + name);
    }

    // public void show1(Mobile obj){ // static method
    // System.out.println(obj.band + " : " + obj.price + " : " + name);
    // }

}

public class Demo_staticVariable {
    public static void main(String[] args) throws ClassNotFoundException{
        
        // Mobile obj1 = new Mobile();
        // obj1.band = "Apple";
        // obj1.price = 1500;
        // //obj1.name = "SmartPhone";
        // Mobile.name = "Phone";

        // Mobile obj2 = new Mobile();
        // obj2.band = "Samsung";
        // obj2.price = 1800;
        // //obj2.name = "SmartPhone";
        // Mobile.name = "Phone";

        // //obj1.name ="Phone";
        // obj1.show();
        // obj2.show();

       // Mobile.show1(obj1);

       Class.forName("Mobile");// how to call you static block and how to load the class
    }

}
