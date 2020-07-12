package com.pekka.blogserver.common.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
/**
 * @Auther :朱树广
 * @Date :2020/6/17
 * @Description :com.pekka.blogserver.common.dto
 * @Version :1.0
 */
@Data
public class LoginDto implements Serializable {

    @NotBlank(message = "昵称不能为空")
    private String username;

    @NotBlank(message = "密码不能为空")
    private String password;
}
