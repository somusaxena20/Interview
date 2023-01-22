import java.util.Arrays;

public class TransposeMatrix {
    public static int[][] transpose(int[][] matrix) {
        int [][] res=new int [matrix[0].length][matrix.length];
         for(int i=0;i<matrix.length;i++){
             for(int j=0;j<matrix[0].length;j++){
                 res[j][i]=matrix[i][j];
             }
         }return res;
     }
     public static void main(String []args)
     {
         int [][]a = {{1,2,3},{4,5,6}};
        int [][]res = transpose(a);
         for(int i = 0; i<res.length; i++)
         {
            System.out.println(Arrays.toString(res[i]));
         }
     }
}
