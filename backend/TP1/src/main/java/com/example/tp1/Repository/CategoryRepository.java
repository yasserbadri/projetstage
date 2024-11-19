package com.example.tp1.Repository;

import com.example.tp1.Model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {

    List<Category> findByTitle(String titre);
    List<Category> findCategoryByDescriptionAndTitle(String description, String title);
}
