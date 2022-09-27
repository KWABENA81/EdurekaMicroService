package com.edu.userms;


@RestController
public class UserResource {

    @Autowired
    private UserRepo repo;

    @GetMapping("/hello")
    public String getHello() {
        return "Hello World!";
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return repo.findAll();
    }
}
