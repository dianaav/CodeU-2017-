package assignment4;
import java.util.*;

public class Main{
  
    public static final boolean WATER = false;
    public static final boolean LAND = true;
	
    public static final boolean[][] grid = 
      {{WATER, LAND, WATER, LAND, WATER},
      {LAND, LAND, WATER, WATER, WATER},
      {WATER, WATER, LAND, WATER, WATER},
      {WATER, WATER, LAND, WATER, LAND}};
  
    public static void main(String[] args){
      Islands islands = new Islands(grid);
      System.out.println(islands.countIslands());
      }
}
