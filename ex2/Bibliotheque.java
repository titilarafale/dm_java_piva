public class Bibliotheque {
	public static final int LEN_MAX = 32;
	private Document[] contenu;
	private int nbDoc;

	public Bibliotheque() {
		this.nbDoc = 0;
		this.contenu = new Document[LEN_MAX];
	}

	/**
	 * @return 0 si l'opération est un succès, 1 sinon
	 **/
	public int addDocument(Document d) {
		if (nbDoc + 1 > LEN_MAX) {
			return 1;
		} else {
			this.contenu[nbDoc] = d;
			this.nbDoc += 1;
			return 0;
		}
	}

	public String toString() {
		String docList = "";

		for (int i = 0; i < nbDoc - 1; i++) {
			docList += contenu[i].toString() + "\n\n";
		}
		docList += contenu[nbDoc - 1].toString() + "\n";

		return "Bibliotheque :\n~~~[Documents]~~~\n" + docList + "~~~~~~~~~~~~~~~~~\n\n";
	}

	public String getDocFromAuthor(String auteur) {
		String docs = "";

		for (int i = 0; i < nbDoc; i++) {
			Document currentDoc = contenu[i];
			if (currentDoc instanceof Livre
					&& auteur.equals(((Livre) currentDoc).getAuteur())) {
				docs += currentDoc.toString() + "\n\n";
			}
		}

		return docs;
	}
}
