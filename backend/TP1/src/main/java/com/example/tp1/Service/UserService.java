package com.example.tp1.Service;

import com.example.tp1.Model.Provider;
import com.example.tp1.Model.User;
import com.example.tp1.Repository.ProviderRepository;
import com.example.tp1.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public User createUser(User user){
        return userRepository.save(user);
    }
    public List<User> getAllUser()
    {
        return userRepository.findAll();
    }
    public User getUserById(Long id)
    {
        return userRepository.findById(id).get();
    }
    public User updateUser(User user)
    {
        return userRepository.saveAndFlush(user);
    }
    public void deleteUser(Long id)
    {
        userRepository.deleteById(id);
    }
}
