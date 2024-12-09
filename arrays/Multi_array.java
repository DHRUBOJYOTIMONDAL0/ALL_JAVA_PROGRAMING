public class Multi_array {

    public static void main(String[] args) {
        int num[][] = new int[3][4]; 
        // First array [3] for row and second array [4] for column

        // Filling the array with random values
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                num[i][j] = (int) (Math.random() * 10);
            }
        }

        // Printing the array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(num[i][j]+ " ");  // Adding space for better readability
            }
            System.out.println(); // New line after each row
        }

        for(int n[] : num){
            for (int m : n){ // m is taking value from the array n

                System.out.print(m+" "); 
            }
            System.out.println();  // New line after each row of the 2D array  // This is a way to print all the elements of the 2D array in a single line.  // This is useful when dealing with large 2D arrays.  // The above for loop is equivalent to this.  // For loop for 2D array is not recommended as it can be slow and inefficient for large arrays.  // Use nested for loop for better performance 
        }
    }
}
