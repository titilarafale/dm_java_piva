import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Livre leCapital = new Livre("Karl Marx", "Le Capital volume 1", "folio essai", 1872);
		Livre leCapital2 = new Livre("Karl Marx", "Le Capital volume 2", "folio essai", 1872);
		Livre genderTrouble = new Livre("Judith Butler", "Gender Trouble", "La Découverte poche", 1990);
		Revue nature = new Revue(444, "L'ADN comme stockage ?", Revue.Domaine.Sciences, 2024);
		DVD killBill = new DVD("Kill Bill", 111, DVD.Domaine.Film);

		/* ===[Test des Documents]=== */
		System.out.println("===[Affichage de Documents]===");
		System.out.println(leCapital.toString() + "\n");
		System.out.println(nature.toString() + "\n");
		System.out.println(killBill.toString() + "\n");

		/* ===[Test de Bibliotheque]=== */
		Bibliotheque b = new Bibliotheque();
		b.addDocument(leCapital);
		b.addDocument(nature);
		b.addDocument(genderTrouble);
		b.addDocument(killBill);
		b.addDocument(leCapital2);

		System.out.println("===[Affichage de la Bibliotheque]===");
		System.out.println(b.toString());

		System.out.println("===[Affichage des livres de Karl Marx dans la Bibliotheque]===");
		System.out.println(b.getDocFromAuthor("Karl Marx"));

		String auteur;
		Scanner input = new Scanner(System.in);

		System.out.print("Entrez le nom d'un auteur dont vous voulez trouver les oeuvres : ");
		auteur = input.nextLine();

		System.out.printf("===[Oeuvres de %s]===\n", auteur);
		System.out.println(b.getDocFromAuthor(auteur));
		input.close();
	}
}
