import java.util.ArrayList;

public class Bibliotheque2 {
	private ArrayList<Document> contenu;

	public Bibliotheque2() {
		this.contenu = new ArrayList<Document>();
	}

	public void addDocument(Document d) {
		this.contenu.add(d);
	}

	public String toString() {
		String docList = "";
		int nbDoc = contenu.size();

		for (int i = 0; i < nbDoc - 1; i++) {
			docList += contenu.get(i).toString() + "\n\n";
		}
		docList += contenu.get(nbDoc - 1).toString() + "\n";

		return "Bibliotheque :\n~~~[Documents]~~~\n" + docList + "~~~~~~~~~~~~~~~~~\n\n";
	}

	public String getDocFromAuthor(String auteur) {
		String docs = "";
		int nbDoc = contenu.size();

		for (int i = 0; i < nbDoc; i++) {
			Document currentDoc = contenu.get(i);
			// cast currentDoc en livre si il en est une instance,
			// puisque seul les livres ont un champ auteur,
			// puis vérifie que l'auteur du livre est le même que celui en argument
			if (currentDoc instanceof Livre
					&& auteur.equals(((Livre) currentDoc).getAuteur())) {
				docs += currentDoc.toString() + "\n\n";
			}
		}

		return docs;
	}
}
