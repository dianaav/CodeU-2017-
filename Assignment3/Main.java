package assignment3;
import java.util.*;

public class Main{
  public static void main(String[] args){
    char[][] grid = new char[][] {
                {'a', 'a', 'r'},
                {'t', 'c', 'd'}
        };
    String[] words = {"car", "card", "cart", "cat"};
    MyDictionary dict = new MyDictionary(words);
    
    //dict.printPrefixes();
    
    WordSearch ws = new WordSearch(grid, dict);
    Iterator it = ws.getWordsInGrid().iterator();

    while(it.hasNext()){
      System.out.println(it.next().toString());
      }
  }
}
