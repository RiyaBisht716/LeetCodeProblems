class Solution {
    public int numSpecial(int[][] mat) {
        int a = mat.length;
        int b = mat[0].length;

        int[] row = new int[a];
        int[] col = new int[b];

        for(int i= 0; i<a;i++){
            for(int j = 0; j <b;j++){
                if(mat[i][j] == 1){
                    row[i]++;
                    col[j]++;
                }
            }
        }

        int ans =0;
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                if(mat[i][j] == 1 && row[i]== 1 && col[j] ==1){
                    ans++;
                }
            }
        }
        return ans;
        
    }
}