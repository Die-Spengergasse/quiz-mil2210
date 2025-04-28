package at.spengergasse.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name= "q_questions")
public class Question {
    // Entity klasse für jede tabelle
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY) //Autro
    @Column (name= "q_id")
    private int id;
    @Column (name = "q_text")
    private String text;
    @OneToMany
    @JoinColumn(name="fk_q_id")
    private List<Answer> answersList = new ArrayList<>();

    @Override
    public String toString () {
        return "Question [id=" + id + ", text=" + text + "]";

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<Answer> getAnswersList() {
        return answersList;
    }

    public void setAnswersList(List<Answer> answersList) {
        this.answersList = answersList;
    }
}
