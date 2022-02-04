package com.lernapp.answer;

import com.github.dockerjava.api.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class AnswerService {
    AnswerRepository answerRepository;


    List<Answer> getAnswers() {
        List<Answer> answers = new ArrayList<Answer>();
        answerRepository.findAll().forEach(answers1 -> answers.add(answers1));
        return answers;
    }

    public void addNewAnswer(Answer answer) {

        answerRepository.save(answer);

    }

    public void deleteAnswer(int id) {
        answerRepository.deleteById(id);
    }

    public Answer getAnswer(int id) {
        return answerRepository.findById(id).get();
    }
}

