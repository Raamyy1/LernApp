package com.lernapp.appapi.answer;



import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private  int id ;
    @Column(name = "studentAnswer")
    private  String studentAnswer;
    @Column(name = "hashedStudentId")
    private  String hashedStudentId;
    @Column(name = "answerDate")
    private Date answerDate = new Date();


    public Answer() {
    }

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




}

