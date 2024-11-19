package com.example.tp1.Service;

import com.example.tp1.Model.Category;
import com.example.tp1.Model.Customer;
import com.example.tp1.Model.Orderr;
import com.example.tp1.Repository.CategoryRepository;
import com.example.tp1.Repository.OrderrRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;
    public Category createCategory(Category category){
        return categoryRepository.save(category);
    }
    public List<Category> getAllCategory()
    {
        return categoryRepository.findAll();
    }
    public Category getCategoryById(Long id)
    {
        return categoryRepository.findById(id).get();
    }
    public Category updateCategory(Category category)
    {
        return categoryRepository.saveAndFlush(category);
    }
    public void deleteCategory(Long id)
    {
        categoryRepository.deleteById(id);
    }
}
