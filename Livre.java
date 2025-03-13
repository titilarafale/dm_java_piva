public class Livre {
	private String auteur;
	private String titre;
	private String editeur;
	private int annee;

	public Livre(String auteur, String titre, String editeur, int annee) {
		this.auteur = auteur;
		this.titre = titre;
		this.editeur = editeur;
		this.annee = annee;
	}

	/* ---[Affichage]--- */
	public String toString() {
		return "Livre :\nauteur : " + auteur + "\ntitre : " + titre + "\nediteur : " + editeur + "\nannée : " + annee;
	}

	/* ---[Getters et setters]--- */
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public String getAuteur() {
		return this.auteur;
	}

	public String getTitre() {
		return this.titre;
	}

	public String getEditeur() {
		return this.editeur;
	}

	public int getAnnee() {
		return this.annee;
	}

}
