package com.example.tp1.Service;

import com.example.tp1.Model.Orderr;
import com.example.tp1.Model.Subcategory;
import com.example.tp1.Repository.SubcategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SubcategoryService {
    @Autowired
    SubcategoryRepository subcategoryRepository;
    public Subcategory createSubcategory(Subcategory subcategory){
        return subcategoryRepository.save(subcategory);
    }
    public List<Subcategory> getAllSubcategory()
    {
        return subcategoryRepository.findAll();
    }
    public Subcategory getSubcategoryById(Long id)
    {
        return subcategoryRepository.findById(id).get();
    }
    public Subcategory updateSubcategory(Subcategory subcategory)
    {
        return subcategoryRepository.saveAndFlush(subcategory);
    }
    public void deleteSubcategory(Long id)
    {
        subcategoryRepository.deleteById(id);
    }
}
