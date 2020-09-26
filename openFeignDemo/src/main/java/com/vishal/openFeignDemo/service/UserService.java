package com.vishal.openFeignDemo.service;

import com.vishal.openFeignDemo.dto.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Vishal Sharma
 * @created 26/09/2020 - 8:13 PM
 */
@FeignClient(name = "feignUserService", url = "http://localhost:8084")
public interface UserService {

    @GetMapping(value = "/user")
    List<User> getUserList();


    @PostMapping("/user")
    String addUser(User user);

    @DeleteMapping("/user/{id}")
    String deleteUser(@PathVariable("id") String id);

}
