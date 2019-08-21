package cn.lixinblog.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigClientController {

    @Value("${foo}")
    String foo;


    @GetMapping("/hello")
    public String sayHello(){
        return foo;
    }

}
