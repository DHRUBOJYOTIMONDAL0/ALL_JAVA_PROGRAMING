class Calculator{
    int num; // Intance variable    
    public int add(int n1, int n2){ // this addition take two parameters
        int r = n1 + n2;           // n1 and n2 are local variables
        return r;

    }
    public int add(int n1, int n2, int n3){ // this addition take three parameters 
        int r = n1 + n2 + n3;
        return r;
    }
    public double add(double n1, int n2){ 
                                        // When you have double and int you return with 
                                           // double Different number of parameters or same number of parameters
                                           // different type now this is concept in JAVA is called 
                                           // Method over loading
        double r = n1 + n2;
        return r;
    }
}


public class demo {

    public static void main(String[] args) {
        
        // int num1 = 10;
        // int num2 = 10;
        // int num3 = 10;
        //int result = num1 + num2;

        Calculator clac = new Calculator(); // create a new object using new keyword arguments
        int result = clac.add(10,10,10);


        System.out.println("The sum is: " + result);
    }
    
}



// Object Oriented Programming
// Objject - Properties and Behaviours

// Every object have two things properties and methods
// Class 