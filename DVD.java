public class DVD extends Document {
	private String titre;
	private int duree; // durée du DVD en minutes
	private Domaine domaine;

	enum Domaine {
		Musique,
		Film,
		Documentaire
	}

	public DVD(String titre, int duree, Domaine domaine) {
		this.titre = titre;
		this.duree = duree;
		this.domaine = domaine;
	}

	/* ---[Affichage]--- */
	@Override
	public String toString() {
		return "DVD :\ntitre : " + titre + "\nduree : " + duree + " min\ndomaine : " + domaine;
	}

	/* ---[Getters et setters]--- */
	public String getTitre() {
		return titre;
	}

	public int getDuree() {
		return duree;
	}

	public Domaine getDomaine() {
		return domaine;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public void setDomaine(Domaine domaine) {
		this.domaine = domaine;
	}
}
