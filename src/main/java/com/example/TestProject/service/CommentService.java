package com.example.TestProject.service;

import com.example.TestProject.entities.Comment;
import com.example.TestProject.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Optional;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    public Iterable<Comment> getComments(){
        return commentRepository.findAll();
    }

    public Optional<Comment> getCommentById(Integer id){
        return commentRepository.findById(id);
    }
}
