
import java.util.HashMap;
import java.util.Map;

class Common_Element_all_row {
    static void findcommonElement(int[][] matrix){
        if (matrix == null || matrix.length ==0) {
            System.out.println("Matrix is empty or invalid");
            return;
        }
        Map<Integer,Boolean> commonelement = new HashMap<>();
        
        for (int element : matrix[0]) {
            commonelement.put(element, true);
        }
        for (int i = 0; i < matrix.length; i++) {
            Map<Integer,Boolean> currentelement = new HashMap<>();
            for (int element : matrix[i]) {
                if (commonelement.containsKey(element)) {
                    currentelement.put(element, true);
                }
            }
            commonelement = currentelement;
            
        }
        // System.out.println(commonelement);
        for (Map.Entry<Integer, Boolean> entry : commonelement.entrySet()) {
            if (entry.getValue()) {
                System.out.println("Common element is " + entry.getKey()+" ");
            }
        }

    }
    public static void main(String[] args) {
         int[][] matrix = {
                {1, 2, 3, 4, 5},
                {2, 3, 5, 7, 8},
                {3, 5, 9, 10, 11},
                {1, 2, 3, 5, 6}
        };
        findcommonElement(matrix);
    }
    
}