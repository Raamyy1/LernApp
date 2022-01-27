package com.lernapp.answer;


import javax.persistence.*;
import java.util.Date;

@Entity
public class Answer {
    public int getId() {
        return id;
    }

    public String getStudentAnswer() {
        return studentAnswer;
    }

    public Date getAnswerDate() {
        return answerDate;
    }

    public String getHashedStudentId() {
        return hashedStudentId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private final int id ;
    @Column(name = "studentAnswer")
    private final String studentAnswer;
    @Column(name = "hashedStudentId")
    private final String hashedStudentId;
    @Column(name = "answerDate")
    private final Date answerDate;

    public Answer(int id, String studentAnswer, String hashedStudentId, Date answerDate) {
        this.id = id;
        this.studentAnswer = studentAnswer;
        this.hashedStudentId = hashedStudentId;
        this.answerDate = answerDate;
    }
}

