package com.lernapp.appapi.answer;

import com.lernapp.appapi.answer.Answer;
import com.lernapp.appapi.answer.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnswerService {
    @Autowired
    AnswerRepository answerRepository;


    public List<Answer> getAnswers() {
        List<Answer> answers = new ArrayList<Answer>();
        answerRepository.findAll().forEach(answers1 -> answers.add(answers1));
        return answers;
    }

    public Answer addNewAnswer(Answer answer) {
        Answer entity;
        entity = answerRepository.save(answer);
        return entity;

    }

    public void deleteAnswer(int id) {
        answerRepository.deleteById(id);
    }

    public Answer getAnswer(int id) {
        return answerRepository.findById(id).get();
    }
}

