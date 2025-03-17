package at.spengergasse.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    private List<Question> questions;
    private Scanner scanner = new Scanner(System.in);
    int nextQuestion =0;

    public Quiz() {
        this.questions = questions;
    }

    public void start(){
        while (nextQuestion < questions.size()) {
            showQuestions();
        }
    }


    public void showQuestions() {

        Question question = questions.get(nextQuestion);

        System.out.print(question.getText());

        List<Answer> answer= question.getAnswersList();
        for(int i=0; i< answer.size(); i++){
            Answer answers = answer.get(i);
            System.out.print((i+1) + ") " + answers.get(i).getText());
        }

        System.out.println("answer: ");
        try {
            int a = Integer.parseInt(scanner.nextLine())-1;
            check(question, a);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }

    }

    public void finish (){
        System.out.println("Quiz finished");
    }
    public void check(Question question, int a) {

    }

}
