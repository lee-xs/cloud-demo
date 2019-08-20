package cn.lixinblog.interfaces.impl;

import cn.lixinblog.interfaces.SchedualUserService;
import org.springframework.stereotype.Component;

@Component
public class SchedualUserServiceHystrix implements SchedualUserService {

    @Override
    public String sayUser(Integer id) {
        return "sorry," + id;
    }

    @Override
    public String sayHello(String name) {
        return "sorry," + name;
    }

}
