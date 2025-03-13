public class Revue extends Document {
	private int numero;
	private String titre;
	private Domaine domaine;
	private int annee;

	enum Domaine {
		Sciences,
		Histoire,
		Sante,
		Art
	}

	public Revue(int numero, String titre, Domaine domaine, int annee) {
		this.numero = numero;
		this.titre = titre;
		this.domaine = domaine;
		this.annee = annee;
	}

	/* ---[Affichage]--- */
	@Override
	public String toString() {
		return "Revue :\nnumero : " + numero + "\ntitre : " + titre + "\ndomaine : " + domaine + "\nannée : " + annee;
	}

	/* ---[Getters et setters]--- */
	public int getNumero() {
		return numero;
	}

	public String getTitre() {
		return titre;
	}

	public Domaine getDomaine() {
		return domaine;
	}

	public int getAnnee() {
		return annee;
	}

	// Setters
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public void setDomaine(Domaine domaine) {
		this.domaine = domaine;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}
}
