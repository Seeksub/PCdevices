public class AdjMatrix {
    int [] [] adjacencyMatrix;
    int rows, cols;
    AdjMatrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        adjacencyMatrix = new int[rows][cols];
    }
    public int getNoRows() {  // returns the total number of rows
        return rows;
    }
    public int getNoCols() { // returns the total number of cols
        return cols;
    }

    public int getValue(int row, int col) {
        return adjacencyMatrix[row][col];
    }
    public void setValue(int row, int col, int value) {
        adjacencyMatrix[row][col] = value;
    }

    public int rowSum(int row) {
        int count = 0;
        for (int i = 0; i <cols; i++) {
            count+= getValue(row, i);
        }
        return count;
    }

    public void DisplayMatrix() {
        for (int i = 0; i < this.getNoRows(); i++) {
            for (int j = 0; j < this.getNoCols();
                 j++) {
                System.out.print((this.getValue(i, j)) + " ");
            }
            System.out.print("\n");
        }
    }
}


