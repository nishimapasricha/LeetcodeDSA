class Solution {
    public int uniquePaths(int m, int n) {
        int arr[][]=new int[m][n];
        for(int[]temp:arr)
            Arrays.fill(temp,0);  
        return uniquePathsWithObstacles(arr); 
    }
      int dp[][];
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n=obstacleGrid.length;
        int m=obstacleGrid[0].length;
         dp=new int[n+1][m+1];
        for(int[] arr:dp)
            Arrays.fill(arr,-1);
        if(obstacleGrid[0][0]==1)
            return 0;
        return uniquePaths(obstacleGrid,0,0);
    }
    
    public int uniquePaths(int[][] arr,int i,int j){
        int n=arr.length;
        int m=arr[0].length;
       //  System.out.println("  before i : "+i+"  j : "+j );
        
        if(i>=n || j>=m)
            return 0;
        if(arr[i][j]==1)
            return 0;
        if(i==n-1 && j==m-1 && arr[i][j]==0)
            return 1;
        else{
            if(dp[i][j]!=-1)
                return dp[i][j];
               dp[i][j]=uniquePaths(arr,i+1,j)+uniquePaths(arr,i,j+1);
        }
       // System.out.println("  After i : "+i+"  j : "+j );
        return dp[i][j];
    }
}