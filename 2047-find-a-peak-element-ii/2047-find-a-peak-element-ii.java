class Solution {
    public int findMaxIndex(int[][]mat ,int n,int m,int col){
        int maxValue =-1;//finding the max element in column
        int index = -1;//track of max element index in col
        for(int i=0;i<n;i++){
            if(mat[i][col]> maxValue){
                maxValue = mat[i][col];
                index = i;
            }
        }
        return index;
    }
    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int low =0;
        int high = m-1;
        //apply binary search

        while(low<=high){
            int mid =(low+high)/2;
            int maxRowIndex = findMaxIndex(mat,n,m,mid);// row index in which max element in col is find
            int left = mid-1 >=0 ? mat[maxRowIndex][mid-1]:-1;
            int right = mid+1 <m ? mat[maxRowIndex][mid+1]:-1;
            if(mat[maxRowIndex][mid] > left && mat[maxRowIndex][mid]> right){
                return new int[]{maxRowIndex,mid};//possible peak value 
            }
            else if(mat[maxRowIndex][mid] < left ){
                high= mid -1;//check for max value in column

            }
            else{
                low = mid +1;

            }
        
        }

        return new int[]{-1,-1};
        
    }
}