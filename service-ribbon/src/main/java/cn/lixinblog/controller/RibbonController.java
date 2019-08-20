package cn.lixinblog.controller;

import cn.lixinblog.pojo.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/ribbon")
public class RibbonController {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "findByIdError")
    @GetMapping("/{id}")
    public String findById(@PathVariable Long id){
        return restTemplate.getForObject("http://user-service/user/" + id, User.class).toString();
    }

    public String findByIdError(Long id){
        return "hi, " + id + ",sorry, error!";
    }

    @HystrixCommand(fallbackMethod = "sayHelloError")
    @GetMapping("/hello")
    public String sayHello(@RequestParam("name") String name){
        return restTemplate.getForObject("http://user-service/user/hello?name=" + name, String.class);
    }

    public String sayHelloError(String name){
        return "sorry," + name;
    }

}
