package com.zou.test;

import com.zou.entity.Comic;
import com.zou.mapper.ComicMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author: 邹祥发
 * @date: 2021/5/18 13:18
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.zou.mapper")
public class ReptileTest {

    @Autowired
    private ComicMapper comicMapper;

    @Test
    public void selectTest() {
        System.out.println(("----- selectAll method test ------"));
        List<Comic> list = comicMapper.selectList(null);
        Assert.assertEquals(193, list.size());
        list.forEach(System.out::println);
    }
}
