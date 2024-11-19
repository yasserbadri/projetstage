package com.example.tp1.Repository;

import com.example.tp1.Model.Provider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProviderRepository extends JpaRepository<Provider,Long> {

List<Provider> findByMatricule(String matricule);
List<Provider> findProviderByMatriculeAndService(String matricule, String service);
}
