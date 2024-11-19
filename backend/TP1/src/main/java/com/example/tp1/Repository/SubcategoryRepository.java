package com.example.tp1.Repository;

import com.example.tp1.Model.Subcategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubcategoryRepository extends JpaRepository<Subcategory, Long> {
List<Subcategory> findByTitle(String title);
List<Subcategory> findSubcategoryByTitleAndDescription(String title,String description);
}
