package com.lernapp.answer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
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