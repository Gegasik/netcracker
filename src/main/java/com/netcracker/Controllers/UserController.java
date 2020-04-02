package com.netcracker.Controllers;

import com.netcracker.entity.Users;
import com.netcracker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login/{login}", method = RequestMethod.GET)
    public ResponseEntity<Users> getUserByLogin(@PathVariable(name = "login") String login) {
        Users user = userService.findByLogin(login).get();
        return ResponseEntity.ok(user);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Users> getAllUsers() {
        return userService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Users saveUser(@RequestBody Users user) {
        return userService.save(user);
    }

}
