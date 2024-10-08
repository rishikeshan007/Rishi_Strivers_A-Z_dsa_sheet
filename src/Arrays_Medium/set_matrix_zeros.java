package Arrays_Medium;

import java.util.*;
public class set_matrix_zeros {

    public static void bruteforce_Setmatrix(int n, int m, int[][]matrix){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){

                if(matrix[i][j]==0){
                    markRow(i, matrix, m);
                    markCol(j, matrix, n);
                }
            }
        }

        for(int r =0; r<m;r++){
            for(int k=0;k<n;k++){
                if(matrix[r][k]==-1){
                    matrix[r][k] = 0;
                }
            }
        }

    }
    public static void markRow(int k, int[][]matrix, int m){
        for(int i=0;i<m; i++){
            if(matrix[k][i]!=0){
                matrix[k][i] = -1;
            }
        }
    }
    public static void markCol(int k, int[][]matrix, int n){
        for(int i=0;i<n; i++){
            if(matrix[k][i]!=0){
                matrix[k][i] = -1;
            }
        }


    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int[][]matrix = new int[n][m];
        for(int i = 0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j] = input.nextInt();
            }

        }
        bruteforce_Setmatrix(n,m,matrix);

        for(int r =0; r<m;r++){
            for(int k=0;k<n;k++){

                System.out.print(matrix[r][k]+" ");
            }
            System.out.println();
        }

    }
}
