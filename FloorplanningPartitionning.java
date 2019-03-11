import java.io.*;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FloorplanningPartitionning {

    public static void main(String[] args) throws FileNotFoundException{
        int N = 5;
        AdjMatrix S = MatrixReader();
        S.DisplayMatrix();

    }
    public static AdjMatrix MatrixReader() throws FileNotFoundException {
        System.out.println("Give the filename for the matrix");
        Scanner filescanner = new Scanner(System.in);
        Scanner scanner = new Scanner(new File(filescanner.nextLine()));
        scanner.nextLine(); // removes the first line in the input file

        int rows = scanner.nextInt();
        int cols  = scanner.nextInt();

        AdjMatrix matrix = new AdjMatrix(rows, cols);

        int i = 0;
        while (scanner.hasNextInt()) {
            for (int j = 0; j < cols; j++) {
                matrix.setValue(i, j, scanner.nextInt());
            }
            i++;
        }
        return matrix;
    }
}
