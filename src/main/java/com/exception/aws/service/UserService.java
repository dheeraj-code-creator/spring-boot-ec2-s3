package com.exception.aws.service;

import com.exception.aws.entity.User;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    List<User> list = Arrays.asList(new User("Jack", "111", 5000.0),
                                    new User("Lisa", "222", 8000.0));
    public List<User> findUserDetals() {
        return list;
    }
}
