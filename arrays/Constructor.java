class Human {
    private int age;
    private String name;

    public Human(){
        name = "Ronik";
        age = 24;
        //System.out.println("In constructor");
    }

    public Human(int a, String n){ // prameterized constructor
        age = a;
        name = n;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}

public class Constructor {

    public static void main(String[] args) {
        Human obj = new Human();
         Human obj1 = new Human(21, "Ankur");
        System.out.println(obj1.getName() + " : " + obj1.getAge());
        // obj.age = 20;
        // obj.name = "Sayan";
        // System.out.println(obj.name + " : " + obj.age);

        obj.setAge(20);
        obj.setName("Sayan");
        System.out.println(obj.getName() + " : " + obj.getAge());


    }

}
// constructor looks like a method itself
// constructor don't specify the return type
// constructor name should be same as a class name
// every time you create an object constructor will be called