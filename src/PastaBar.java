import java.util.Scanner;

public class PastaBar {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String recZaPotvrduNarudzbine = "Poruci";
		String[] sastojci = { "Makarone", "Spagete", "Bolognese", "Curetina", "Govedja prsuta", "Slanina", "Piletina",
				"4 sira", "Dimljeni sir", "Parmezan", "Pavlaka", "Pesto sos", "Napolitana", "Povrce mix", "Pecurke",
				"Kutija" };
		String[] brojeviTelefonaStalnihMusterija = { "0631111111", "063222222", "063333333", "064444444", "065555555",
				"066666666" };
		
		System.out.println("Izvolite ! ");
		String sastojak = "";
		int suma = 0;
		while (!sastojak.equals(recZaPotvrduNarudzbine)) {
			System.out.print("Izaberite sastojak za pastu: ");
			sastojak = s.nextLine();
			suma = findIngredient(sastojci, sastojak) + suma;
		}
		System.out.print("Unesite Vas broj telefona: ");
		String brojTelefonaMusterije = s.next();

		if (isRegularCustomer(brojeviTelefonaStalnihMusterija, brojTelefonaMusterije)) {
			System.out.println("Vasa pasta iznosi: " + (suma - (int)(suma*(10.0 / 100.0))) + "RSD " + 
		"(objasnjenje: Ovaj korisnik ima popust od 10 posto.)");
		} else { 
			System.out.println("Vasa pasta iznosi: " + suma 
			+ "RSD " + "(objasnjenje: Ovaj korisnik nema popust.)");
			
		}
		System.out.print("Prijatno ! ");

	}

	public static int findIngredient(String[] ingredients, String ingredientName) {
		int[] cene = { 50, 60, 120, 120, 140, 100, 100, 100, 80, 50, 80, 80, 80, 50, 50, 20 };
		for (int i = 0; i < ingredients.length; i++) {
			if (ingredients[i].equals(ingredientName)) {
				return cene[i];
			}
		}
		return 0;
	}

	public static boolean isRegularCustomer(String[] phoneNumbers, String phone) {
		for (int i = 0; i < phoneNumbers.length; i++) {
			if (phone.equals(phoneNumbers[i])) {
				return true;
			}
		}
		return false;
	}

}
	