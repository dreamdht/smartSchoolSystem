package com.flyfish.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @autohr flyfish
 * @date: 2023/2/25 17:28
 * @description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
    private Integer tid;
    private String tname;
    private String phone;
    private String username;
    private String password;
}
