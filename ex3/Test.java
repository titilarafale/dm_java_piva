public class Test {
	public static void main(String[] args) {
		/* ===[Test de QuestionQCM]=== */
		System.out.println("===[question 1]===");
		Reponse q1r1 = new Reponse("gets", false);
		Reponse q1r2 = new Reponse("fgets", true);
		Reponse q1r3 = new Reponse("read", true);
		Reponse q1r4 = new Reponse("scanf(\"%s\", *buf)", false);
		QuestionQCM q1 = new QuestionQCM(
				"Quelle fonction permet de recevoir l'entrée de l'utilisateur de manière sécurisée en C ?");

		q1.addReponse(q1r1);
		q1.addReponse(q1r2);
		q1.addReponse(q1r3);
		q1.addReponse(q1r4);
		q1.setDifficulte(30);

		System.out.println(q1.toString() + "\n");

		/* ===[Test de QuestionNotee]=== */
		System.out.println("===[question notée 1]===");
		QuestionNotee qn1 = new QuestionNotee(q1, 1);

		System.out.println(qn1.toString() + "\n");

		/* ===[Création de la question 2]=== */
		Reponse q2r1 = new Reponse("4D 5A", true);
		Reponse q2r2 = new Reponse("7F 45 4C 46", false);
		QuestionQCM q2 = new QuestionQCM(
				"Quelle est la signature d'un fichier executable portable windows (PE magic bytes)");

		q2.addReponse(q2r1);
		q2.addReponse(q2r2);
		q2.setDifficulte(80);

		QuestionNotee qn2 = new QuestionNotee(q2, 2);

		/* ===[Création de la question 3]=== */
		Reponse q3r1 = new Reponse("SYN, SYN ACK, ACK", true);
		Reponse q3r2 = new Reponse("SYN, SYN, ACK", false);
		Reponse q3r3 = new Reponse("SYN, SYN ACK", false);
		QuestionQCM q3 = new QuestionQCM(
				"Quelle est la pocédure standart de connexion pour le protocole TCP (TCP handshake)");

		q3.addReponse(q3r1);
		q3.addReponse(q3r2);
		q3.addReponse(q3r3);

		QuestionNotee qn3 = new QuestionNotee(q3, 2);

		/* ===[Test de Examen]=== */
		System.out.println("===[examen]===");
		Examen exam = new Examen();
		exam.addQuestion(qn1);
		exam.addQuestion(qn2);
		exam.addQuestion(qn3);

		System.out.println(exam.toString());
		System.out.println("Difficulté moyenne : " + exam.getAvgDifficulte());
	}
}
