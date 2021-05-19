package com.zou.controller;

import com.zou.entity.Comic;
import com.zou.mapper.ComicMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: 邹祥发
 * @date: 2021/5/18 13:26
 */
@Controller
public class ComicController {

    @Resource
    ComicMapper comicMapper;

    @RequestMapping("/comic")
    public String showAll(Model m) {
        List<Comic> lists = comicMapper.selectList(null);
        m.addAttribute("comic",lists);
//        System.out.println(lists);

        return "comic";
    }
}