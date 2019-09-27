package com.hp.com.hp.pojo;

import lombok.*;

/**
 *@AllArgsConstructor有参构造方法
 * @NoArgsConstructor无参构造方法
 * @Setter set方法
 * @Getter get方法
 *
 */
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class User {
    private Integer uId;
    private String uName;
    private String uPassword;
    private String uRealName;
    private String eMail;
    private String uPhone;
    private String uAddress;


}
