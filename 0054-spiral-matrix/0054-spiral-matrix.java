class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> res = new ArrayList<>();

        if (matrix == null || matrix.length == 0) {
            return res;
        }

        int n = matrix.length;
        int m = matrix[0].length;

        int sr = 0;          // Start row
        int er = n - 1;      // End row
        int sc = 0;          // Start column
        int ec = m - 1;      // End column 
        
        while (sr <= er && sc <= ec) {
            // 1. Left to Right (Top row)
            for (int i = sc; i <= ec; i++) {
                res.add(matrix[sr][i]);
            }
            sr++; // Move top boundary down

            // 2. Top to Bottom (Right column)
            for (int i = sr; i <= er; i++) { 
                res.add(matrix[i][ec]);
            }
            ec--; // Move right boundary left

            // 3. Right to Left (Bottom row)
            if (sr <= er) {
                for (int i = ec; i >= sc; i--) { 
                    res.add(matrix[er][i]);
                }
                er--; // Move bottom boundary up
            }

            // 4. Bottom to Top (Left column)
            if (sc <= ec) {
                for (int i = er; i >= sr; i--) {
                    res.add(matrix[i][sc]);
                }
                sc++; // Move left boundary right
            }
        }
        return res;
    }
}