package cn.lixinblog.user.controller;

import cn.lixinblog.user.pojo.User;
import cn.lixinblog.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id){
        return userService.findById(id);
    }

    @GetMapping("/hello")
    public String sayHello(@RequestParam("name") String name){
        return "hello," + name;
    }

}
