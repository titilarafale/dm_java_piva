public class Test {
	public static void main(String[] args) {
		Livre leCapital = new Livre("Karl Marx", "Le Capital volume 1", "folio essai", 1872);
		Revue nature = new Revue(444, "L'ADN comme stockage ?", Revue.Domaine.Sciences, 2024);
		DVD killBill = new DVD("Kill Bill", 111, DVD.Domaine.Film);

		System.out.println(leCapital.toString() + "\n");
		System.out.println(nature.toString() + "\n");
		System.out.println(killBill.toString() + "\n");

	}
}
