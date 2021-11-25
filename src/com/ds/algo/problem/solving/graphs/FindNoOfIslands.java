package com.ds.algo.problem.solving.graphs;

public class FindNoOfIslands {

    private static boolean visited[][];

    public static void dfs(char[][] grid , int row , int col) {
        int rowSize = grid.length;
        int colSize = grid[0].length;
        visited[row][col] = true;
        int rows[] = { 0 , -1 , 0 , 1};
        int cols[] = { -1 , 0  , 1 , 0};
        for(int i = 0;i < 4;i++) {
            int newRow = row + rows[i];
            int newCol = col + cols[i];
            if(newRow >= 0 && newRow < rowSize && newCol>=0 && newCol < colSize && grid[newRow][newCol] == '1' && !visited[newRow][newCol]){
                dfs(grid ,newRow , newCol);
            }
        }
    }

    public static int numOfIslands(char[][] grid) {
        int noOfIslands = 0;
        for(int i = 0;i < grid.length;i++) {
            for(int j = 0;j < grid[i].length;j++) {
                if(grid[i][j] == '1' && !visited[i][j]) {
                    dfs(grid,i,j);
                    noOfIslands++;
                }
            }
        }
        return noOfIslands;
    }


    public static void main(String[] args) {

        char grid[][] = {{'1','1','0','0','0'},
                         {'1','1','0','0','0'},
                        {'0','0','1','0','0'},
                        {'0','0','0','1','1'}};
        visited = new boolean[grid.length][grid[0].length];
        System.out.println(numOfIslands(grid));


    }


}
