class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        ArrayList<Integer> x = new ArrayList<Integer>();
        ArrayList<Integer> y = new ArrayList<Integer>();
        int max = 0;
        for(int i = 0 ; i < grid.length ; i ++){
            for(int j = 0 ; j < grid[0].length ; j ++){
                if(grid[i][j] > max)
                    max = grid[i][j];
            }
            x.add(max);
            System.out.println(max);
            max = 0;
        }
        max = 0;
        for(int i = 0 ; i < grid[0].length ; i ++){
            for(int j = 0 ; j < grid.length ; j ++){
                if(grid[j][i] > max)
                    max = grid[j][i];
            }
            y.add(max);
            System.out.println(max);
            max = 0;
        }
        int sum = 0;
        for(int i = 0 ; i < grid.length ; i ++){
            for(int j = 0 ; j < grid[0].length ; j ++){
                //System.out.println(x.get(i)<y.get(j)?x.get(i):y.get(j) + " " + grid[i][j]);
                sum += ((x.get(i)<y.get(j)?x.get(i):y.get(j)) - grid[i][j]);
            }
        }
        return sum;
    }
}