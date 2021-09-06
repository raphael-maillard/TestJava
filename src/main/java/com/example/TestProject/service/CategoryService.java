package com.example.TestProject.service;

import com.example.TestProject.entities.Category;
import com.example.TestProject.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public Iterable<Category> getCategories(){
        return categoryRepository.findAll();
    }
    public Optional<Category> getCategoryById(Integer id){
        return categoryRepository.findById(id);
    }
}
