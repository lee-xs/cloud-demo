package cn.lixinblog.consumer.pojo;

import lombok.Data;
import java.util.Date;

@Data
public class User {
    private Long id;

    private String username;

    private String password;

    private String nickname;

    private String email;

    private Date created;

}
