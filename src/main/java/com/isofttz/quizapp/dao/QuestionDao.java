package com.isofttz.quizapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.isofttz.quizapp.model.QuestionModel;

@Repository
public interface QuestionDao extends JpaRepository<QuestionModel, Integer> {

}
