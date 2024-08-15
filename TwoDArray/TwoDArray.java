import java.util.*;

public class TwoDArray {

    public static void searchKey(int matrix[][]){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == 7){
                    System.out.println("Key found at cell ("+i+","+j+")");
                }
            }
        }
    }

    public static void findLargest(int matrix[][]){
        int max = Integer.MIN_VALUE;

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] > max){
                    max = matrix[i][j];
                }
            }
        }

        System.out.println("Largest element is : "+max);
    }

    public static void main(String[] args) {

        int matrix[][] = new int[3][3];

        int n = 3, m = 3;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        searchKey(matrix);

        findLargest(matrix);

    }
}
