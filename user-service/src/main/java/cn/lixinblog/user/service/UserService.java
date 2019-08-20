package cn.lixinblog.user.service;

import cn.lixinblog.user.mapper.UserMapper;
import cn.lixinblog.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User findById(Long id){
        return userMapper.selectByPrimaryKey(id);
    }
}
