class Question {
	String enonce;
	int difficulte = 50; // la difficulte varie de 0 à 100

	Question(String enonce) {
		this.enonce = enonce;
	}

	@Override
	public String toString() {
		return "Question [enonce=" + enonce + ", difficulte=" + difficulte + "]";
	}

	void setDifficulte(int difficulte) {
		this.difficulte = difficulte;
	}

	int getDifficulte() {
		return this.difficulte;
	}

	String getEnonce() {
		return this.enonce;
	}
}
