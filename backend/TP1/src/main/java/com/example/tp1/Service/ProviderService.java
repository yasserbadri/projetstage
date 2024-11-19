package com.example.tp1.Service;

import com.example.tp1.Model.Orderr;
import com.example.tp1.Model.Provider;
import com.example.tp1.Repository.OrderrRepository;
import com.example.tp1.Repository.ProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProviderService {
    @Autowired
    ProviderRepository providerRepository;
    public Provider createProvider(Provider provider){
        return providerRepository.save(provider);
    }
    public List<Provider> getAllProvider()
    {
        return providerRepository.findAll();
    }
    public Provider getProviderById(Long id)
    {
        return providerRepository.findById(id).get();
    }
    public Provider updateProvider(Provider provider)
    {
        return providerRepository.saveAndFlush(provider);
    }
    public void deleteProvider(Long id)
    {
        providerRepository.deleteById(id);
    }
}
