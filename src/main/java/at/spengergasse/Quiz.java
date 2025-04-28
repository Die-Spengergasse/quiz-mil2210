package at.spengergasse;

import at.spengergasse.entities.Answer;
import at.spengergasse.entities.Question;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    private List<Question> questions;
    private Scanner scanner = new Scanner(System.in);
    int nextQuestion =0;

    public Quiz() {
        EntityManager em = Persistence.createEntityManagerFactory("demo")
                .createEntityManager();

        TypedQuery<Question> query = em.createQuery("select q from Question q", Question.class);
        List<Question> questions = query.getResultList();

        for (Question q : questions) {
            System.out.println(q);
        }

//        TypedQuery<Answer> querys = em.createQuery("select a from Answer a", Answer.class);
//        List<Answer> answers = querys.getResultList();
//
//        for (Answer a : answers) {
//            System.out.println(a);
//        }
        for (Question q : questions) {
            q.getAnswersList().size();
}
            em.close();
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
            System.out.print((i+1) + ") " + answers.getText());
        }

        System.out.println("answer: ");
        try {
            int a = Integer.parseInt(scanner.nextLine())-1;
            check(question, a);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        nextQuestion++;

    }

    public void check(Question question, int a) {
        //if(a>=0 && a<=a< ){}
    }
    public void finish (){
        System.out.println("Quiz finished");
    }

}
