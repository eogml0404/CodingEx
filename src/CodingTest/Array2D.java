package CodingTest;

public class Array2D {
    public static void main(String[] args) {
        
    int[][] arr2 = new int[3][4];   
    int sum = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j<4; j++){
                 arr2[i][j] = (int)(Math.random()*10);           
           
                sum += arr2[i][j]; 
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println("합은 " + sum);

    }
}
