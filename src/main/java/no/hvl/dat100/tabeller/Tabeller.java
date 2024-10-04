package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		
		System.out.print("[");
		
		for (int i = 0; i < tabell.length; i++) {
			System.out.print(tabell[i] + " ");
		}
		
		System.out.print("]");
		
	}

	// b)
	public static String tilStreng(int[] tabell) {
		String s ="[";
		for(int i = 0; i < tabell.length; i++) {
			s += String.valueOf(tabell[i]);
			if(i < tabell.length - 1) {
				s += ",";
			}
		}
		s += "[";
		return s;
			
		}
		

	// c)
	public static int summer(int[] tabell) {
		
		int sum = 0;
		
		for(int i = 0; i < tabell.length; i++) {
		
		sum = sum + tabell[i];
		
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		boolean verdi = false;
		
		for(int i = 0; i < tabell.length; i++) {
			if(tabell[i] == tall) {
				verdi = true;
				break;
			}
		}
		return verdi;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		int pos = -1;

		for(int i = 0; i < tabell.length; i++) {
			if(tabell[i] == tall) {
				pos = i;
			}
			}
		return pos;
	}

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden reverser ikke implementert");
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("Metoden settSammen ikke implementert");

	}
}
