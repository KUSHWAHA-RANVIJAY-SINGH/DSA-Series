public class Search_a_2D_Matrix_74 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };
        int target = 3;
        System.out.println(searchMatrix(matrix, target));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int low = 0, high = n * m - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int midElement = matrix[mid / m][mid % m];
            if (midElement == target) {
                return true;
            } else if (target > midElement) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
}
