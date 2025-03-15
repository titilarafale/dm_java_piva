import java.util.ArrayList;

public class Examen {
	private ArrayList<QuestionNotee> questions;

	public Examen() {
		this.questions = new ArrayList<QuestionNotee>();
	}

	public int getAvgDifficulte() {
		int avg = 0, nbQuestions = 0;

		for (QuestionNotee q : questions) {
			avg += q.getDifficulte();
			nbQuestions++;
		}

		return avg / nbQuestions;
	}

	public void addQuestion(QuestionNotee q) {
		this.questions.add(q);
	}

	public void deleteQuestion(int index) {
		this.questions.remove(index);
	}

	public String toString() {
		String out = "---[Questions de l'examen]---\n";
		int i = 0;

		for (QuestionNotee q : questions) {
			out += "Question " + i + "\n" + q.toString() + "\n\n";
			i++;
		}

		return out;
	}
}
