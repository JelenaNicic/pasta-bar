package mini_projekat;

import java.util.Scanner;

public class PastaBar {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		String[] nizStalneMusterije = { "0631111111", "063222222", "063333333", "064444444", "065555555", "066666666" };
		String[] nizSastojci = { "Makarone", "Spagete", "Bolognes", "Curetina", "Govedja prsuta", "Slanina", "Piletina",
				"4 sira", "Dimljeni sir", "Parmezan", "Pavlaka", "Pesto sos", "Napolitana", "Povrce mix", "Pecurke",
				"Kutija" };
		int[] nizCene = { 50, 60, 120, 120, 140, 100, 100, 100, 80, 50, 80, 80, 80, 50, 50, 20 };

		double ukupnaCena = 0;
		int i = 0;

		System.out.println("Izvolite!!");

		while (i != -2) {
			System.out.println("Unesite sastojak: ");
			i = nadjiIndeksSastojka(nizSastojci, s.next());
			if (i >= 0) {
				ukupnaCena = ukupnaCena + nizCene[i];
			} else if (i != -2) {
				System.out.println("Ne postoji trazeni sastojak");
			}
		}

		System.out.println("Unesite vas broj telefona: ");

		boolean stalnaM = stalnaMusterija(nizStalneMusterije, s.next());

		if (stalnaM == true) {
			ukupnaCena = 0.9 * ukupnaCena;
		}

		System.out.println("Vasa pasta iznosi " + ukupnaCena + " rsd.");

		System.out.println("Prijatno!!");

	}

	public static int nadjiIndeksSastojka(String[] nizSastojaka, String naziv) {
		for (int i = 0; i < nizSastojaka.length; i++) {

			if (nizSastojaka[i].equals(naziv)) {

				return i;
			}
		}
		if (naziv.equals("Poruci")) {
			return -2;
		}
		return -1;
	}

	public static boolean stalnaMusterija(String[] nizMusterija, String brTelefona) {
		for (int i = 0; i < nizMusterija.length; i++) {
			if (nizMusterija[i].equals(brTelefona)) {
				return true;
			}
		}

		return false;
	}

}
