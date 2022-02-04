package com.lernapp.appapi.answer;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnswerController {
    @Autowired
    AnswerService answerService;

    @GetMapping
    public List<Answer> listAnswers() {
        return answerService.getAnswers();
    }

    @GetMapping("{id}")
    public Answer getAnswerId(@PathVariable("id") Integer id) {
        return answerService.getAnswer(id);
    }

    @PostMapping
    public void addAnswer (@RequestBody Answer answer ) {
        answerService.addNewAnswer(answer);
    }

    @DeleteMapping("{id}")
    public void deleteMovie(@PathVariable("id") Integer id) {
        answerService.deleteAnswer(id);
    }

}