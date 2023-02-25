package com.flyfish.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @autohr flyfish
 * @date: 2023/2/25 17:36
 * @description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Kids {
    private Integer kid;

    private String name;

    private String gender;

    private String age;

    /*是否从家出发---家长端控制
    * 0：未出发
    * 1：已出发
    * */
    private Integer go_school_state;

    /* 是否离校---教师端控制
     * 0：未离校
     * 1：已离校
     * */
    private Integer leave_school_state;

    /*实际到校时间---教师端控制*/
    private Date go_school_time;

    /*实际离校时间---教师端控制*/
    private Date leave_school_time;

    /*外键关联班级id*/
    private Integer cid;

    /*外键关联父母id*/
    private Integer pid;

    private Classes classes;

    private Parent parent;

}
