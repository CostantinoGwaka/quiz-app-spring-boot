package com.isofttz.quizapp.controller;

import org.springframework.web.bind.annotation.RestController;

import com.isofttz.quizapp.model.QuestionModel;
import com.isofttz.quizapp.services.QuestionServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    QuestionServices questionServices;

    @GetMapping("allQuestions")
    public List<QuestionModel> getAllQuestion() {
        return questionServices.getAllQuestions();
    }
}
