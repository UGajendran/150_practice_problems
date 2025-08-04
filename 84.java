// Given a 2D integer array matrix, return the transpose of the matrix.
// Explanation:
// The transpose of a matrix is the matrix flipped over its main diagonal, switching
// the matrix's row and column indices.
// Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
// Output: [[1,4,7],[2,5,8],[3,6,9]]
import java.util.Arrays;
class Main{
    public static void main(String[] args){
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int[][] num = new int[arr.length][arr[0].length];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                num[i][j] = arr[j][i];
            }
        }
        System.out.println(Arrays.deepToString(num));
    }
}