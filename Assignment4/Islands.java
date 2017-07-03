package assignment4;

public class Islands{
  private boolean[][] islands;
  private int length;
  private int width;
  
  public Islands (boolean[][] islands){
    this.islands = islands;
    this.length = islands.length;
    this.width = islands[0].length;
  }
 
 public int countIslands() {
    	int count = 0;
    	for (int i = 0; i < length; i++)
        	for (int j = 0;j < width; j++){
            	if (islands[i][j]){
                	check(i,j);
                	count++;
            }
        }
    	return count;
 }
  
  private void check(int i, int j){
    	if(i>=0 && j>=0 && i<length && j<width && islands[i][j]){
        	islands[i][j] = false;
        	check(i + 1, j);
        	check(i - 1, j);
        	check(i, j + 1);
        	check(i, j - 1);
   		 }
	}
}
