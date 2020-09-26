package com.vishal.openFeignDemo.controller;

import com.vishal.openFeignDemo.dto.User;
import com.vishal.openFeignDemo.service.UserService;
import org.apache.logging.slf4j.SLF4JLoggerContextFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Vishal Sharma
 * @created 26/09/2020 - 8:13 PM
 */
@RestController
@RequestMapping("feign-client-controller")
public class FeignClientController {

    private Logger logger = LoggerFactory.getLogger(FeignClientController.class);

    @Autowired
    private UserService userService;

    @GetMapping("userList")
    public List<User> userList(){
        logger.info("calling userList() to get list of users");
        return userService.getUserList();
    }


    @PostMapping("user")
    public String addUser(@RequestBody User user){
        logger.info("adding user");
        return userService.addUser(user);
    }
    @DeleteMapping("/user/{id}")
    String deleteUser(@PathVariable String id){
        logger.info("deleting user - {}", id);
        return userService.deleteUser(id);
    }
}
