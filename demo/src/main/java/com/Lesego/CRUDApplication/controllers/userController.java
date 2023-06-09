package com.Lesego.CRUDApplication.controllers;

import com.Lesego.CRUDApplication.entity.user;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user/")
public class userController {


    /**
     * endpoint to get all users
     * @return ResponseEntity<List<user>>
     *     returns a list of users
     *     returns a 404 if no users are found
     *     returns a 500 if an error occurs
     *     @Author Lesego
     *     @Date 2021-09-23
     *     @Version 0.0.1
     *
     * */
    @GetMapping("/user")
    public ResponseEntity<List<user>> getUsers(){
        return null;
    }

    /**
     * endpoint to get user by id
     * @param id
     * @return ResponseEntity<user>
     *     returns a user
     *     returns a 404 if no user is found
     *     returns a 500 if an error occurs
     *     @Author Lesego
     *     @Date 2021-09-23
     *     @Version 0.0.1
     *
     * */
    @GetMapping("user/{id}")
    public ResponseEntity<user> getUserById(@PathVariable long id){
        return null;
    }

    /**
     * endpoint to create user
     * @param user
     * @return ResponseEntity<user>
     *     returns a user
     *     returns a 409 if user already exists
     *     returns a 500 if an error occurs
     *     @Author Lesego
     *     @Date 2021-09-23
     *     @Version 0.0.1
     * */
    @PostMapping("/user")
    public ResponseEntity<user> createUser(@RequestBody user user){
        return null;
    }

    /**
    @PatchMapping("/user/{id}")
    public ResponseEntity<user> updateUser(){
        return null;
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<user> deleteUser(){
        return null;
    }


}
