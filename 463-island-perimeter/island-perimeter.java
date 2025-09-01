class Solution {
    public int islandPerimeter(int[][] g) {
     int area=0;
     for(int i=0;i<g.length;i++)
     {
        for(int j=0;j<g[i].length;j++)
        {
            if(g[i][j]==1)
            {
                if(i-1<0||g[i-1][j]==0)
                area++;
                if(j+1==g[i].length||g[i][j+1]==0)
                area++;
                if(i+1==g.length||g[i+1][j]==0)
                area++;
                if(j-1<0||g[i][j-1]==0)
                area++;
            }
        }
     } 
      return area;
    }
}