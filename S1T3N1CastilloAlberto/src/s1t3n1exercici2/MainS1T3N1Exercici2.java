package s1t3n1exercici2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class MainS1T3N1Exercici2 {

	public static void main(String[] args) {
		
		
		List<Integer> listInteger1 = new ArrayList<Integer>();
		
		listInteger1.add(25);
		listInteger1.add(56);
		listInteger1.add(13);
		listInteger1.add(37);		
		
		List<Integer> listInteger2 = new ArrayList<Integer>();
		   Collections.reverse(listInteger1);
		   listInteger2.addAll(listInteger1);
		
		System.out.println(listInteger2);
		
		ListIterator<Integer> it = listInteger1.listIterator(); 
		
		while(it.hasNext()) {
			listInteger2.add(it.next());
			
		}
		
		System.out.println(listInteger2);
		
		
	}

}
