package exercise1;
import java.util.HashMap;

public class Permutation{

	private String s1;
	private String s2;

	public Permutation(String s1, String s2){
		this.s1=s1.toLowerCase();
		this.s2=s2.toLowerCase();
	}

	public boolean compareStrings(){
    		if(s1.length() != s2.length()){
        		return false;
    		}
		HashMap<Character, Integer> map1 = getFrequencies(s1);
		HashMap<Character, Integer> map2 = getFrequencies(s2);
		for(Character c : map1.keySet()){
			if(map2.get(c) != map1.get(c)){
				return false;
			}
    		}
		return true;
	}

	public HashMap<Character, Integer> getFrequencies(String s){
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			int frequency;
			if (map.containsKey(c)) {
				frequency = map.get(c);
			} else {
				frequency = 0;
			}
		map.put(c, frequency + 1);
		}
    		return map;
	}
}
