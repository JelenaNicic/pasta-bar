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
}