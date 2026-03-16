class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] answer = new int[m][n];
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                int sum = 0;
                for(int row=i-k;row<=i+k;row++) {
                    for(int col=j-k;col<=j+k;col++) {
                        if(row>=0 && row < m && col>=0 && col<n) {
                            sum+=mat[row][col];
                        }
                    }
                }
                answer[i][j] = sum;
            }
        }
        return answer;
    }
}