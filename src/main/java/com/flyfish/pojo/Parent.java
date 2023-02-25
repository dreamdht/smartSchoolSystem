package com.flyfish.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @autohr flyfish
 * @date: 2023/2/25 17:34
 * @description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Parent {
    private Integer pid;
    private String phone;
    private String username;
    private String password;
    private Integer kid;

    private Kids kids;
}
