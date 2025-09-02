class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
          int m = mat.length, n = mat[0].length;
        if (m * n != r * c) return mat;
        int arr[][]=new int[r][c];
        ArrayList<Integer>l=new ArrayList<>();
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                l.add(mat[i][j]);
            }
        }
        System.out.println(l);
        int k=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=l.get(k++);
                
            }
        }
        return arr;
    }
}