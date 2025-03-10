package at.spengergasse.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    private List<Question> questions;
    private Scanner scanner = new Scanner(System.in);
    int nextQuestion =0;

    public Quiz() {

    }

    public void showQuestionAnswer(){
        Question question = questions.get(nextQuestion);
        System.out.print(question.getText());
        List<Answer> answer= question.getAnswersList();
        for(int i=0; i< answer.size(); i++){
            Answer answers = answer.get(i);
            System.out.print((i+1) + " " + answers.getText());
        }
        System.out.println("answer: ");
        int a = Integer.parseInt(scanner.nextLine());

    }


}
