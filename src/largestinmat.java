    import java.util.Arrays;

    public class largestinmat {

        public static void main(String[] args) {
            int[][] matrix = {
                    {3, 7, 2, 8},
                    {1, 9, 4, 6}
            };

            findLargestInRows(matrix);
        }

        public static void findLargestInRows(int[][] arr) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].length == 0) {
                    System.out.println("Row is empty");
                    continue;
                }
                int largest = arr[i][0];
                for (int j = 1; j < arr[i].length; j++) {
                    if (arr[i][j] > largest) {
                        largest = arr[i][j];
                    }
                }
                System.out.println( largest);
            }
        }
    }

