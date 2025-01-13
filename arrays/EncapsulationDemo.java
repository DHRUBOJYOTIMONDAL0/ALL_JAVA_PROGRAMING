class Human{
    // private int age = 21;
    // private String name = "Dhrub";
    private int age;
    private String name;

    public int getAge(){
        return age;
    }

    public void setAge(int a){
        age = a; // 'this' is a keyword
    }
    public String getName(){
        return name;
    }
    public void setName(String n){ // 'n' is a local variable
        name = n; // 'name' is a instance variable
    }
    // public void setName(String name){
    //     this.name = name; // 'this' is a keyword
    // }
}



public class EncapsulationDemo {
    public static void main(String[] args){
        Human obj = new Human();
        //obj.age = 25; // age show error because age is a private variable
        //obj.name = "Dhrub"; // name show error because age is a private variable
        //System.out.println(obj.name);
        obj.setAge(21);
        obj.setName("Dhrubo");

        System.out.println(obj.getAge() + " : "+obj.getName());

    }
    
}

// Private keywords menas this is partcular variable which is age is accessible
// only in the same class 
// they should be access them but not directly, so there should be indirect way 
// access the data help of method

// 'This' is a keyword which represents the current object