package assignment3; 

public class WordSearch{
	private char[][] grid;
	private MyDictionary dict;
  
  public WordSearch(char[][] grid, MyDictionary dict){
    this.grid=grid;
    this.dict=dict;
    }
  
  public Set<String> getWordsInGrid(){
    Set<String> good = new HashSet<String>();
    
    int rows=grid.length;
    int cols=grid[0].length;

    for(int i=0; i<rows; i++)
      for(int j = 0; j<cols; j++)
        check( i, j, new boolean[rows][cols], Character.toString(grid[i][j]), good);
    return good;
  }
  
  private void check(int row, int col, boolean[][] visited, String word, Set<String> good){  
    visited[row][col] = true;

    if(dict.isWord(word))
      good.add(word);
      
    if(dict.isPrefix(word)){
      for(int x = row - 1; x <= row + 1; x++)
        for(int y = col - 1; y <= row + 1; y++)
          if(valid(x, y)&& (visited[x][y] == false))
            if(dict.isPrefix(word + grid[x][y])){
              word = word + grid[x][y];
              check(x, y, visited, word, good);
              }
    }
}

private boolean valid(int row, int col){
  int rows=grid.length;
  int cols=grid[0].length;
  if (row < 0 || row >= rows || col < 0 || col >= cols) 
			  return false;
  return true;
  }
}
