class Solution {
    public void setZeroes(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;


        int rowTrack[] = new int[m];
        int colTrack[] = new int[n];

        Arrays.fill(rowTrack, 0);
        Arrays.fill(colTrack, 0);

        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(matrix[i][j] == 0)
                {
                    rowTrack[i] = 1;
                    colTrack[j] = 1;
                }
            }
        }

        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(rowTrack[i] == 1 || colTrack[j] == 1)
                    matrix[i][j] = 0;
            }
        }
        
    }
}
