package s1t3n1exercici1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;


public class MainS1T3N1Exercici1 {

	public static void main(String[] args) {

		/*
		 * January, February, March, April, May, June, July, August, September, October,
		 * November, December
		 */
		Month january = new Month("January");
		Month february = new Month("February");
		Month march = new Month("March");
		Month april = new Month("April");
		Month may = new Month("May");
		Month june = new Month("June");
		Month july = new Month("July");
		Month august = new Month("August");
		Month september = new Month("September");
		Month october = new Month("October");
		Month november = new Month("November");
		Month december = new Month("December");

		ArrayList<Month> listMonth = new ArrayList<Month>();
		listMonth.add(january);
		listMonth.add(february);
		listMonth.add(march);
		listMonth.add(april);
		listMonth.add(may);
		listMonth.add(june);
		listMonth.add(july);
		listMonth.add(september);
		listMonth.add(october);
		listMonth.add(november);
		listMonth.add(december);

		listMonth.add(7, august);//
		for (Month value : listMonth) {

			System.out.println(value);

		}

		System.out.println("\n*** HashSet for ***\n");
		HashSet<Month> listMonthHashSet = new HashSet<Month>(listMonth);

		listMonthHashSet.add(november);// comprobacion

		for (Month value : listMonthHashSet) {
			System.out.println(value);

		}

		Iterator<Month> i = listMonthHashSet.iterator();

		System.out.println("\n*** Iterator***\n");
		while (i.hasNext()) {

			System.out.println(i.next());

		}

	}

}
