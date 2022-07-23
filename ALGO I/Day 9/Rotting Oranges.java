class Solution {
    // storing it in a pair of coordinates as this will help to traverse.
     public class Pair{
        int x;
        int y;
         Pair(int x, int y)
        {
            this.x=x;
            this.y=y;
        }
    }
    
    
    public int orangesRotting(int[][] grid) {
         Queue <Pair> queue = new ArrayDeque<>();
        int [][] directions = new int[][]{{-1,0}, {0,+1}, {+1,0}, {0,-1}};
         int nFreshOranges =0;// this is to check if there fresh oranges remaining in the end.
        
        // first look through the matrix and count the no of fresh oranges and also add the rotten oranges in the
        // queue. This is important as there is no component checking here.
        for (int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length ;j++)
            {
                if(grid[i][j]==1)
                {
                    nFreshOranges++;
                }      
                
                else if(grid[i][j]==2)
                {
                  queue.add(new Pair(i,j));
                }
            }
        }
        
        int level=0;
        
        // In the main queue only 1s will be added
        // the elements in the queue will do the job.
		// no traversing through the matrix using for loop as the queue elements will do the job
        while(queue.size()>0)
        {
            int lsize=queue.size();
            while(lsize-->0)
            {
                Pair temp = queue.remove();
                
              
                for(int i=0;i<4;i++)
                {
                    int row = temp.x + directions[i][0];
                    int column = temp.y + directions[i][1];
                    
                    if(row <0 || row>=grid.length || column<0 || column>=grid[0].length || grid[row][column]!=1 )
                     {
                       continue;
                     }
                 
                     // decreasing the fresh oranges as one will rot and be marked as such in the matrix.
                    nFreshOranges--;
                    grid[row][column]=2;
                    
                
                    queue.add(new Pair(row,column));
                 }
                
            }
             // building the minimum time  
            if(queue.size()!=0)
                level ++;
            
            
        }
          // if no freh ornges are left  
        if(nFreshOranges ==0)
            {
                return level;
            }
        else
        {
            return -1;
        }
           
            
            
        }
      
    }