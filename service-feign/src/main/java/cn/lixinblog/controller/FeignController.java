package cn.lixinblog.controller;

import cn.lixinblog.interfaces.SchedualUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/feign")
public class FeignController {

    @Autowired
    private SchedualUserService schedualUserSerrvice;

    @GetMapping("/{id}")
    public String findUser(@PathVariable("id") Integer id){
        return schedualUserSerrvice.sayUser(id);
    }

    @GetMapping("/hello")
    public String sayHello(@RequestParam("name") String name){
        return schedualUserSerrvice.sayHello(name);
    }

}
