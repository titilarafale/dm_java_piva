import java.util.ArrayList;

public class QuestionQCM extends Question {
	private ArrayList<Reponse> reponses;

	public QuestionQCM(String enonce, ArrayList<Reponse> r) {
		super(enonce);
		this.reponses = r;
	}

	public QuestionQCM(String enonce) {
		super(enonce);
		this.reponses = new ArrayList<Reponse>();
	}

	@Override
	public String toString() {
		String out = "QuestionQCM [enonce=" + enonce + ", difficulte=" + difficulte + ",\n\treponses=(\n";

		for (int i = 0; i < reponses.size() - 1; i++) {
			out += "\tréponse " + i + " : " + reponses.get(i).toString() + "\n";
		}
		out += "\tréponse " + (reponses.size() - 1) + " : " + reponses.getLast().toString() + ")]";
		return out;
	}

	public void addReponse(Reponse r) {
		this.reponses.add(r);
	}

	public ArrayList<Reponse> getReponses() {
		return reponses;
	}

	public void setReponses(ArrayList<Reponse> reponses) {
		this.reponses = reponses;
	}

}
