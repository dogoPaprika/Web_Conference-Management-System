package com.cms.controllers;

import com.cms.model.User;
import com.cms.services.UsersService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class UsersController {
    private final UsersService usersService = new UsersService();

    /**
     * Returns the list with all users from the database.
     * @return list of Users as JSON, plus status code 200
     */
    @GetMapping(value = "/users")
    public ResponseEntity<List<User>> get() {
        return ResponseEntity.ok(usersService.get());
    }


    /**
     * Receives a User and must check if it exists in the database with the correct password.
     * In contrary, return Not Found (Error 404).
     * @param user body of HTTP request POST
     * @return TO BE IMPLEMENTED (should return a security check string ~ guid)
     */
    @PostMapping(value = "/users/login")
    public ResponseEntity<String> login(@RequestBody User user) {
        try {
            System.out.println(user);
//            User foundUser = usersService.login(user);

            String stringAsResponse = "\"Login function from backend called.\"";
            return ResponseEntity.ok(stringAsResponse);
        }
        catch(RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping(value = "users/register")
    public ResponseEntity<String> register(@RequestBody User user) {
        try {
            usersService.register(user);

            String stringAsResponse = "\"Register function called in backend.\"";
            return ResponseEntity.ok(stringAsResponse);
        }
        catch(RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

}
