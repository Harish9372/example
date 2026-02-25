package JPrograms;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateIntegerArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n[] = {1,2,3,4,2,3,1,4};
		
		LinkedHashSet<Integer> s = new LinkedHashSet<>();
		
		for (int st : n) {
			
			s.add(st);
		}
		System.out.println("After removing duplicates :"+s);
		
		
		
	}

}
