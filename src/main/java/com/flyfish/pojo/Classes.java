package com.flyfish.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @autohr flyfish
 * @date: 2023/2/25 17:41
 * @description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Classes {
    private Integer cid;
    /*几年级*/
    private String grade;
    /*几班*/
    private String clas;
}
