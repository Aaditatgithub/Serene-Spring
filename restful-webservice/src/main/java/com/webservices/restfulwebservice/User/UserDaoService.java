package com.webservices.restfulwebservice.User;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class UserDaoService {

    private static List<User> users = new ArrayList<>();
    private static int count = 0;

    static {
        users.add(new User(++count, "Abhyankar", LocalDate.now().minusYears(20)));
        users.add(new User(++count, "AshishChanchlani", LocalDate.now().minusYears(29)));
        users.add(new User(++count, "Sonakshi", LocalDate.now().minusYears(22)));
    }

    //Retrieve all users
    public List<User> findAll() {
        return users;
    }

    //save user
    public User saveUser(User user){
        user.setId(++count);
        users.add(user);
        return user;
    }

    //Retrieve 1 users
    public User findOne(@PathVariable int id) {
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().orElse(null);
    }

    //Delete a user
    public void deleteById(int id){
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        users.removeIf(predicate);
    }
}
