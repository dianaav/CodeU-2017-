package assignment3;

public class MyDictionary{
  private Set<String> words;
  private Set<String> prefixes;
  
  public MyDictionary(String[] words){
   
    this.words = new HashSet<>(Arrays.asList(words));
    this.prefixes = new HashSet<>();
        for (String word : words) {
            for (int i = 1; i <= word.length(); i++) {
                this.prefixes.add(word.substring(0, i));
            }
        }
    }
  
  public void printPrefixes(){
    Iterator it = prefixes.iterator();
		 while(it.hasNext()){
			  System.out.println(it.next());
		  }
  	}
  
  public boolean isWord(String word) {
    return words.contains(word);
  }

  public boolean isPrefix(String prefix) {
    return prefixes.contains(prefix);
  }
}  
