package CodingTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();
		
		set.add("java");
		set.add("jdbc");
		set.add("jsp");
		set.add("java"); //중복 객체이므로 저장 x		
		set.add("Spring");		
		
		int size = set.size();
		System.out.println("총 객체수 " + size);
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			
			String element = iterator.next();
			System.out.println(element);
			if(element.equals("jsp")) {
				
				iterator.remove();
			}
			
			
		}
		System.out.println();
		
		set.remove("jdbc");
		
		for(String s : set) {
			System.out.println(s);
		}
		
	}

}
