public class Q4 {
    public static void main(String[] args) {
        int matrix1[][] = {{1,2,3},{4,5,6}};
        int matrix2[][] = {{7,8,9},{10,11,12}};

        int resMat[][] = {{0,0,0},{0,0,0}};

        for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix1[i].length; j++) {
                    resMat[i][j] = matrix1[i][j] + matrix2[i][j];
                }
        }

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(resMat[i][j]+ " ");
            }
            System.out.println();
        }

    }
}