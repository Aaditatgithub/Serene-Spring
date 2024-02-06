package com.webservices.restfulwebservice.Jpa;

import com.webservices.restfulwebservice.User.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
