package com.Lesego.CRUDApplication.service;

import com.Lesego.CRUDApplication.entity.user;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.Lesego.CRUDApplication.repository.userRepository;

import java.util.List;

@Service
public class userService {

    private final userRepository userRepository;

    public userService(userRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * Method to get all users
     * @return ResponseEntity<List<user>>
     * @Author Lesego
     * @Date 2021-09-23
     * @Version 0.0.1
     * @throws Exception
     *
     * */
    public ResponseEntity<List<user>> getUsers(){
        return ResponseEntity.ok(userRepository.findAll());
    }

    /**
     * Method to get user by id
     * @param id
     * @return ResponseEntity<user>
     * @Author Lesego
     * @Date 2021-09-23
     * @Version 0.0.1
     * @throws Exception
     *
     * */
    public ResponseEntity<user> getUserById(long id) {
        return ResponseEntity.ok(userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found")));
    }

    /**
     * Method to create user
     * @param user
     * @return ResponseEntity<user>
     * @Author Lesego
     * @Date 2021-09-23
     * @Version 0.0.1
     * @throws Exception
     *
     * */
    public ResponseEntity<user> createUser(user user) {
        return ResponseEntity.ok(userRepository.save(user));
    }

    /**
     * Method to update user
     * @param user
     * @return ResponseEntity<user>
     * @Author Lesego
     * @Date 2021-09-23
     * @Version 0.0.1
     * @throws Exception
     *
     * */
    public ResponseEntity<user> updateUser(user user) {
        return ResponseEntity.ok(userRepository.save(user));
    }

    /**
     * Method to delete user
     * @param id
     * @return ResponseEntity<user>
     * @Author Lesego
     * @Date 2021-09-23
     * @Version 0.0.1
     * @throws Exception
     *
     * */

    public ResponseEntity<user> deleteUser(long id) {
        userRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }



}
