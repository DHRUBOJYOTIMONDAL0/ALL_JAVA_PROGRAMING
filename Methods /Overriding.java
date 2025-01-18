;
class Clac{
    public int add(int a, int b){
        return a+b;
    }
    class AdvClac extends Clac{
        public int add(int a, int b){
            return a+b+1;

        }
    }
}



public class Overriding {
    public static void main(String[] args) {
        //Clac obj = new Clac();
        AdvClac obj = new AdvClac();
         int n = obj.add(5,5);
        System.out.println(n);
    }
    
}
