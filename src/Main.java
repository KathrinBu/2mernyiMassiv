public class Main {
    public static void main(String[] args) {
       int[][] matrix = generateMarrix(10,10) ;
        System.out.println("");
        printMatrix(matrix);
        int[][] matr2 = new int[15][15];
        printMatrix(matr2);
    }

  static int [][]  generateMarrix (int row, int colomn) {
      int [][] matr = new int[row][colomn];
      for (int i = 0; i < row; i++) {
          int a =i+1;
          for (int j = 0; j < colomn; j++) {
              matr[i][j] = a;
          }
      }

      return matr;
  }
  static void printMatrix(int[][] matr) {
      System.out.println("matrix:");
      for (int i = 0; i < matr.length; i++) {
      //    System.out.println(" stroka" + i +" imeet dliny "+ matr[i].length+"\n");
          for (int j = 0; j < matr[i].length; j++) {
              System.out.printf("%4d", matr[i][j]); //printFFFFF(!!!)
          }
          System.out.println("\n");
      }
  }
}
