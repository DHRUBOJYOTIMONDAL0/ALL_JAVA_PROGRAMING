public class Multi_array {

    public static void main(String[] args) {
        int num [][] = new int [3][4]; // frist array [3] for row and second array[4] for column
        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                System.out.print(num[i][j]);
            }
            System.out.println(); // new line after each row
        }

    }
    
}
