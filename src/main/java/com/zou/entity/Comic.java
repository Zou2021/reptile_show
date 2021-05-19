package com.zou.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: 邹祥发
 * @date: 2021/5/18 13:10
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("comic")
public class Comic {
    @TableId(type = IdType.AUTO)
    private Integer did;
    private String name;
    private String url;
    private String type;
    private String author;
}
