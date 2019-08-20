package cn.lixinblog.interfaces;

import cn.lixinblog.interfaces.impl.SchedualUserServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "user-service",fallback = SchedualUserServiceHystrix.class)
public interface SchedualUserService {

    @GetMapping("/user/{id}")
    String sayUser(@PathVariable("id") Integer id);

    @GetMapping("/user/hello")
    String sayHello(@RequestParam("name") String name);
}
