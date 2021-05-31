import java.util.Scanner;

public class Main {

	static int maks(int[] tab, int start, int slutt) {
		if (start == slutt) {
			return tab[start];
		}

		else {
			int midten = (start + slutt) / 2;

			int maksVenstre = maks(tab, start, midten);
			int maksHogre = maks(tab, midten + 1, slutt);

			if (maksVenstre >= maksHogre) {
				return maksVenstre;
			} else {
				return maksHogre;
			}
		}
	}

	static int maks2(int[] tab, int start, int slutt) {
		if (start == slutt) {
			return tab[start];
		}

		else {
			int midten = (start + slutt) / 2;

			int maksVenstre = maks(tab, start, midten);
			int maksHogre = maks(tab, midten + 1, slutt);

			return Math.max(maksVenstre, maksHogre);
		}
	}

	static int maks3(int[] tab, int start, int slutt) {
		if (start == slutt) {
			return tab[start];
		}

		else {
			int midten = (start + slutt) / 2;

			int maksVenstre = maks(tab, start, midten);
			int maksHogre = maks(tab, midten + 1, slutt);

			return maksVenstre > maksHogre ? maksVenstre : maksHogre;
		}
	}

	public static int fakultet(int n) {
		int svar;
		if (n == 1) { // Basis
			svar = 1;
		} else {
			svar = n * fakultet(n - 1); // Rek. kall
		}
		return svar;
	}

	public static int sum(int n) {
		// Summere de n første positive heltall
		int svar;
		if (n == 1) { // Basistilfelle
			svar = 1;
		} else {
			svar = n + sum(n - 1); // Rek. kall
		}
		return svar;
	}// metode

	public static int sumForNoder(LinearNode p) {
		int sum = 0;
		if (p == null) {
			sum = 0;
		} else {

			sum = (int) p.getElement() + sumForNoder(p.getNeste());

		}

		return sum;
	}// metode

	public static int sumForNoder2(LinearNode p) {

		if (p == null) {
			return 0;
		} else {

			return (int) p.getElement() + sumForNoder(p.getNeste());

		}

	}// metode

	public static int sum2(int n) {
		if (n == 1) { // Basis
			return 1;
		} else {
			return n + sum2(n - 1);// Rek. kall
		}
	}// metode

	public static int fib(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		return fib(n - 1) + fib(n - 2);
	}// metode

	public static void reverseLinearNode(LinearNode head) {
		if (head == null)
			return;
		reverseLinearNode(head.getNeste());
		System.out.print(head.getElement()+  "   ");

	}// metode

	public static void main(String[] args) {
		int[] tab = { 11, 8, 4, 10, 2, 45, 7, 0, 61 };

		LinearNode start = new LinearNode(1);
		LinearNode p = new LinearNode(2);
		start.setNeste(p);
		LinearNode q = new LinearNode(3);
		p.setNeste(q);

		System.out.println(maks3(tab, 0, tab.length - 1));
		System.out.println(sumForNoder(start));

//		System.out.print("Oppgi et positivt heltall: ");
//		Scanner scanner = new Scanner(System.in);
//		int n = scanner.nextInt();
//		System.out.println(n + "! = " + fakultet(n));
//		System.out.println("Summen av " + n + " er " + sum(n));
//		System.out.println("Summen av " + n + " er " + sum2(n));

		System.out.println(fib(6));
		reverseLinearNode(start);

	}

}
