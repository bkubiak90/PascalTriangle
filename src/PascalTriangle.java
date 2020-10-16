public class PascalTriangle {

    private int rows;
    private String[][] triangleTab;

    public PascalTriangle(int rows) {
        this.rows = rows;
        this.triangleTab = new String[rows][rows];
        createTriangle();
    }


    private void createTriangle() {

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                int number = countNumber(i, j);
                triangleTab[i][j] = String.valueOf(number);
            }
        }
    }

    public void printTriangle() {

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i; j++) {
                System.out.printf("%3s", " ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.printf("%6s", triangleTab[i][j]);
            }
            System.out.println();
        }
    }

    private int countNumber(int n, int k) {

        int result = 1;

        if (k > n - k) {
            k = n - k;
        }
        for (int i = 0; i < k; i++) {
            result = result * (n - i);
            result = result / (i + 1);
        }
        return result;
    }
}