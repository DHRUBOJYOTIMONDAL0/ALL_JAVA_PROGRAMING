class Human{
    int age;
    String name;
    public Human(){
        name = "Ronik";
        age = 24;
    }
    public Human(Human ref){
        age = ref.age;
        name = ref.name;
        System.out.println(age + " : " + name);
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
}




public class Copy_constructor {
    public static void main(String[] args) {
        Human obj = new Human();
        Human obj1 = new Human(obj);
        System.out.println(obj.getName() + " : " + obj.getAge());
        
    }
    
}
