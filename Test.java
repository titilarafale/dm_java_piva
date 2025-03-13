import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Livre leCapital = new Livre("Karl Marx", "Le Capital volume 1", "folio essai", 1872);
		Livre leCapital2 = new Livre("Karl Marx", "Le Capital volume 2", "folio essai", 1872);
		Revue nature = new Revue(444, "L'ADN comme stockage ?", Revue.Domaine.Sciences, 2024);
		DVD killBill = new DVD("Kill Bill", 111, DVD.Domaine.Film);

		System.out.println(leCapital.toString() + "\n");
		System.out.println(nature.toString() + "\n");
		System.out.println(killBill.toString() + "\n");

		Bibliotheque b = new Bibliotheque();
		b.addDocument(leCapital);
		b.addDocument(nature);
		b.addDocument(killBill);
		b.addDocument(leCapital2);

		System.out.println(b.toString());

		System.out.println("Livres de Karl Marx :");
		System.out.println(b.getDocFromAuthor("Karl Marx"));

		Scanner input = new Scanner(System.in);
		System.out.print("Entrez le nom d'un auteur dont vous voulez trouver les oeuvres : ");
		System.out.println(b.getDocFromAuthor(input.nextLine()));
		input.close();
	}
}
