package mini_projekat;

import java.util.Scanner;

public class PastaBar {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		String[] nizStalneMusterije = new String[6];
		String[] nizSastojci = new String[16];
		;
		int[] nizCene = new int[16];

		nizStalneMusterije[0] = "0631111111";
		nizStalneMusterije[1] = "063222222";
		nizStalneMusterije[2] = "063333333";
		nizStalneMusterije[3] = "064444444";
		nizStalneMusterije[4] = "065555555";
		nizStalneMusterije[5] = "066666666";

		nizSastojci[0] = "Makarone";
		nizCene[0] = 50;
		nizSastojci[1] = "Spagete";
		nizCene[1] = 60;
		nizSastojci[2] = "Bolognese";
		nizCene[2] = 120;
		nizSastojci[3] = "Curetina";
		nizCene[3] = 120;
		nizSastojci[4] = "Govedja prsuta";
		nizCene[4] = 140;
		nizSastojci[5] = "Slanina";
		nizCene[5] = 100;
		nizSastojci[6] = "Piletina";
		nizCene[6] = 100;
		nizSastojci[7] = "4 sira";
		nizCene[7] = 100;
		nizSastojci[8] = "Dimljeni sir";
		nizCene[8] = 80;
		nizSastojci[9] = "Parmezan";
		nizCene[9] = 50;
		nizSastojci[10] = "Pavlaka";
		nizCene[10] = 80;
		nizSastojci[11] = "Pesto sos";
		nizCene[11] = 80;
		nizSastojci[12] = "Napolitana";
		nizCene[12] = 80;
		nizSastojci[13] = "Povrce mix";
		nizCene[13] = 50;
		nizSastojci[14] = "Pecurke";
		nizCene[14] = 50;
		nizSastojci[15] = "Kutija";
		nizCene[15] = 20;

		double ukupnaCena = 0;
		int i = 0;

		System.out.println("Izvolite!!");

		while (i >= 0) {
			System.out.println("Unesite sastojak: ");
			i = nadjiIndeksSastojka(nizSastojci, s.next());
			if (i >= 0) {
				ukupnaCena = ukupnaCena + nizCene[i];
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
