package mini_projekat;

public class PastaBar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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









