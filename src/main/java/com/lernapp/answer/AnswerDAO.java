package com.lernapp.answer;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
public interface AnswerDAO extends AnswerRepository {

    List<Answer> selectAnswer();
    int insertAnswer(Answer answer);
    int deleteAnswer(int id);
    Optional<Answer> selectAnswerById(int id);
}

