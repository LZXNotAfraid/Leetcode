class Solution {
    public int[][] updateMatrix(int[][] matrix) {
        //init matrix, replace 1 with -1
        int[][] pos = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        for(int i = 0 ; i < matrix.length ; i ++){
            for(int j = 0 ; j < matrix[0].length ; j ++){
                if(matrix[i][j] == 1)
                    matrix[i][j] = -1;
            }
        }
        for(int i = 0 ; i < matrix.length ; i ++){
            for(int j = 0 ; j < matrix[0].length ; j ++){
                for(int k = 0 ; k < 4 ; k ++){
                    int x = i + pos[k][0];
                    int y = j + pos[k][1];
                    if(x > -1 && x < matrix.length && y > -1 && y < matrix[0].length && matrix[x][y] != 0 && matrix[i][j] == 0)
                        matrix[x][y] = 1;
                }
            }
        }
        for(int i = 0 ; i < matrix.length ; i ++){
            System.out.println(Arrays.toString(matrix[i]));
        }
        //init the queue
        Queue<int[]> q = new LinkedList<int[]>();
        for(int i = 0 ; i < matrix.length ; i ++){
            for(int j = 0 ; j < matrix[0].length ; j ++){
                if(matrix[i][j] == 1)
                    q.offer(new int[] {i, j});
            }
        }
        //Iterator iter = q.iterator();
        int[] now = null;
        /*while(iter.hasNext()){
            now = (int[])iter.next();
            //System.out.println(Arrays.toString((int[])iter.next()));
            //当前位置，将周围最小标记（除-1外）加一赋值给当前位置
            int min = Integer.MAX_VALUE;
            for(int k = 0 ; k < 4 ; k ++){
                int x = now[0] + pos[k][0];
                int y = now[1] + pos[k][1];
                if(x > -1 && x < matrix.length && y > -1 && y < matrix[0].length && matrix[x][y] < min){
                    if(matrix[x][y] < min && matrix[x][y] != -1)
                        min = matrix[x][y];
                    if(matrix[x][y] == -1){
                        q.offer(new int[] {x, y});//将周围加入队列
                        System.out.println(x+" "+y+" 加入队列");
                    }
                }
                    //min = matrix;
            }
            matrix[now[0]][now[1]] = min + 1;
            q.poll();
        }*/
        
        while(true){
            now = (int[])q.poll();
            if(now == null)
                break;
            else{
                int min = Integer.MAX_VALUE;
                for(int k = 0 ; k < 4 ; k ++){
                    int x = now[0] + pos[k][0];
                    int y = now[1] + pos[k][1];
                    if(x > -1 && x < matrix.length && y > -1 && y < matrix[0].length && matrix[x][y] < min){
                        if(matrix[x][y] < min && matrix[x][y] != -1)
                            min = matrix[x][y];
                        if(matrix[x][y] == -1){
                            q.offer(new int[] {x, y});//将周围加入队列
                            System.out.println(x+" "+y+" 加入队列");
                        }
                    }
                    //min = matrix;
                }
                matrix[now[0]][now[1]] = min + 1;
            }
        }
        
        return matrix;
    }
}
