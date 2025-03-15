public class QuestionNotee {
	private Question question;
	private int nbPoints;

	public QuestionNotee(Question q, int nbPoints) {
		this.question = q;
		this.nbPoints = nbPoints;
	}

	@Override
	public String toString() {
		return nbPoints + " points, " + question.toString();
	}

	public void setDifficulte(int difficulte) {
		this.question.difficulte = difficulte;
	}

	public int getDifficulte() {
		return this.question.getDifficulte();
	}

	public void setEnonce(String enonce) {
		this.question.enonce = enonce;
	}

	public String getEnonce() {
		return this.question.enonce;
	}

	public int getNbPoints() {
		return nbPoints;
	}

	public void setNbPoints(int nbPoints) {
		this.nbPoints = nbPoints;
	}

}
