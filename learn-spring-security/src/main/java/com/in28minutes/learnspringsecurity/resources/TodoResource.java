package com.in28minutes.learnspringsecurity.resources;

import jakarta.annotation.Resource;
import jakarta.annotation.security.RolesAllowed;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

record Todo(String username, String description) {}

@RestController
public class TodoResource {

    private Logger logger = LoggerFactory.getLogger(getClass());


    private static final List<Todo> TODOS_LIST = List.of(
            new Todo("in28minutes", "Get AZ900"),
            new Todo("in28minutes", "Learn Microservices"));

    @GetMapping("/todos")
    public List<Todo> retrieveAllTodos(){
        return TODOS_LIST;
    }

    @GetMapping("/users/{username}/todos")
    @PreAuthorize("hasRole('USER') and #username == authentication.name")
    @PostAuthorize("returnObject.username == 'in28minutes'")
    @RolesAllowed({"USER","ADMIN"})
    public Todo retrieveTodosForUser(@PathVariable String username){
        return TODOS_LIST.get(0);
    }

    @PostMapping("/users/{username}/todos")
    public void createTodosForUser(@PathVariable String username, @RequestBody Todo todo){
        logger.info("Create {} for {}", todo, username);

    }

}
