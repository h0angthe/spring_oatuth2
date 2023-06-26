package com.example.testsecurity.service;

import com.example.testsecurity.infra.entity.User;
import com.example.testsecurity.infra.repository.UserRepository;
import com.example.testsecurity.rest.model.InputCreateUser;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.net.http.HttpResponse;
import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public Object signIn(InputCreateUser inputCreateUser, HttpServletResponse response){
        List<User> users = userRepository.findByEmail(inputCreateUser.getEmail());
        if (CollectionUtils.isEmpty(users)) {
            User user = new User();
            user.setFirstName(inputCreateUser.getFirstName());
            user.setLastName(inputCreateUser.getLastName());
            user.setEmail(inputCreateUser.getEmail());
            user.setPass(inputCreateUser.getPass());
            userRepository.save(user);
        }
      return "registration suscces!";
    }
}
