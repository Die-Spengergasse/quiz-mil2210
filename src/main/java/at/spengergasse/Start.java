package at.spengergasse;

public class Start {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        boolean show = true;

        while (show) {
         quiz.showQuestions();
        }
    }
}
