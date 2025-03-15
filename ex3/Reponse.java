public class Reponse {
	private String enonce;
	private boolean correct;

	public Reponse(String enonce, boolean correct) {
		this.enonce = enonce;
		this.correct = correct;
	}

	@Override
	public String toString() {
		return enonce + ", " + correct;
	}

	public String getEnonce() {
		return enonce;
	}

	public void setEnonce(String enonce) {
		this.enonce = enonce;
	}

	public boolean isCorect() {
		return correct;
	}

	public void setCorect(boolean corect) {
		this.correct = corect;
	}

}
