public class Hello2 {
    class A{
        public void print(){
            System.out.println("Hello, World!");
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Hello2 h = new Hello2();
        A a = h.new A();
        a.print();

        A a2 = new Hello2().new A();

        a2.print();
    }
}
