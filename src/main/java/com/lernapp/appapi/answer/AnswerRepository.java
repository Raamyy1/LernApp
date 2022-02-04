package com.lernapp.appapi.answer;

import com.lernapp.appapi.answer.Answer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AnswerRepository extends CrudRepository<Answer, Integer> {
}
