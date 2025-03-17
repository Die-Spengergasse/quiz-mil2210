package at.spengergasse.entities;

import javax.persistence.*;

@Entity
@Table (name = "a_answers")
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Autro
    @Column(name= "a_id")
    private int id;
    @Column(name="a_correct")
    private boolean correct;
    @Column (name = "a_text")
    private String text;

    @Override
    public String toString() {
        return "Answer [id=" + id + ", correct=" + correct + ", text=" + text + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Question get(int i) {
    }
}
