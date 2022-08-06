class UF {
    int[] id;
    int[] sz;
    int size;
    
    public UF(int n) {
        id = new int[n];
        sz = new int[n];
        for(int i = 0; i < n; i++) {
            id[i] = i;
            sz[i] = 1;
        }
        size = n;
    }
    
    private int find(int q) {
        if(id[q] != q) {
            id[q] = find(id[q]);
        }
        return id[q];
    }
    
    public boolean isConnected(int q, int p) {
        return find(q) == find(p);
    }
    
    public void union(int q, int p) {
        int i = find(q);
        int j = find(p);
        if(i == j) {
            return;
        }
        
        if(sz[i] > sz[j]) {
            id[j] = i;
            sz[i] += sz[j];
        } else {
            id[i] = j;
            sz[j] += sz[i];
        }
        size--;
    }
    
    public int size() {
        return this.size;
    }
}

class Solution {
    // transformation array
    int[] deltaX = {1, 0};
    int[] deltaY = {0, 1};
    
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        
        UF uf = new UF(m * n + 1);
        
        int dummy = m * n;
        
        // step 1:
        unionBoarderO(board, uf, dummy);
        
        // step 2:
        unionInnerO(board, uf);
        
        // step 3: flip 
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(board[i][j] == 'O' && !uf.isConnected(dummy, i * n + j)) {
                    board[i][j] = 'X';
                }
            }
        }
    }
    
    private void unionInnerO(char[][] board, UF uf) {
        int m = board.length;
        int n = board[0].length;
        
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(board[i][j] == 'X') {
                    continue;
                }
                for(int k = 0; k < 2; k++) {
                    if( !isValid(m, n, i + deltaX[k], j + deltaY[k]) || board[i + deltaX[k]][j + deltaY[k]] == 'X') {
                        continue;  
                    }
                    uf.union(i * n + j, (i + deltaX[k]) * n + (j + deltaY[k]));  
                }   
            }
        }
    }
    
    private void unionBoarderO(char[][] board, UF uf, int dummy) {
        int m = board.length;
        int n = board[0].length;
        
        // for upper and lower boundary
        for(int i = 0; i < n; i++) {
            if(board[0][i] == 'O') {
                uf.union(dummy, i);
            }
            
            if(board[m - 1][i] == 'O') {
                uf.union(dummy, (m - 1) * n + i);
            }
        }
        // for left and right boundary
        for(int i = 0; i < m; i++) {
            if(board[i][0] == 'O') {
                uf.union(dummy, i * n);
            }
            
            if(board[i][n - 1] == 'O') {
                uf.union(dummy, i * n + n - 1);
            }
        }
    }
    
    private boolean isValid(int m, int n, int i, int j) {
        if(i < 0 || i >= m) {
            return false;
        }
        
        if(j < 0 || j >= n) {
            return false;
        }
        return true;
    }
}