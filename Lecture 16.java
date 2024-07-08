package arrays;

public class MultiDimArrays {
    public static void main(String[] args) {
        int rows = 5;
        int cols = 3;
        int arr[][] = new int[rows][cols];
        // array creation expression.
        for (int i = 0; i < arr.length; i++) { // i => for rows
            for (int j = 0; j < arr[0].length; j++) { // j => columns
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // leaving line as one row printing completed here
        }
        System.out.println("*******");
        // Array initializers list
        // we want to create the following array
        // 1 2 3
        // 4 5 6
        // 7 8 9
        int arr2[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int i = 0; i < arr2.length; i++) { // i => for rows
            for (int j = 0; j < arr2[0].length; j++) { // j => columns
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println(); // leaving line as one row printing completed here
        }
    }
}

package arrays;

public class JaggedArrays {
    public static void main(String[] args) {
        int arr[][] = new int[3][];
        arr[0] = new int[3];
        arr[1] = new int[2];
        arr[2] = new int[3];
        // printing jagged array properly
        // all rows in separate lines
        for (int i = 0; i < arr.length; i++) { // rows
            for (int j = 0; j < arr[i].length; j++) { // columns
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
