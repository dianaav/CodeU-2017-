package exercise1;

public class Exercise1{
	
	public static void main(String[] args){
		Permutation perm1= new Permutation (“Silent”,”Listen”);
		Permutation perm2= new Permutation (“Triangle”,”Integral”);
		Permutation perm3= new Permutation (“Apple”,”Pabble”);
		System.out.println(“Silent, Listen => ” + perm1.compareStrings());
		System.out.println(“Triangle, Integral => ” + perm2.compareStrings());
		System.out.println(“Apple, Pabble => ” + perm3.compareStrings());
	}
}
