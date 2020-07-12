package com.pekka.blogserver.shiro;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @Auther :朱树广
 * @Date :2020/6/18
 * @Description :com.pekka.blogserver.shiro
 * @Version :1.0
 */
@Data
public class AccountProfile implements Serializable {
    private Long id;

    private String username;

    private String avatar;

    private String email;
}
