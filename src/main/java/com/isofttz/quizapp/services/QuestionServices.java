package com.isofttz.quizapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isofttz.quizapp.dao.QuestionDao;
import com.isofttz.quizapp.model.QuestionModel;

@Service
public class QuestionServices {

    @Autowired
    QuestionDao questionDao;

    public List<QuestionModel> getAllQuestions() {
        return questionDao.findAll();
    }

}
