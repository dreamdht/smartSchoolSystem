package com.flyfish.controller;

import com.flyfish.pojo.Classes;
import com.flyfish.service.ClassesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;


/**
 * @autohr flyfish
 * @date: 2023/2/25 21:14
 * @description:
 */
@RestController
public class ClassesController {
    @Autowired
    private ClassesService classesService;

    @RequestMapping("/all")
    public ModelAndView getAll(){
        List<Classes> all = classesService.getAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("list");
        modelAndView.addObject("list",all);
        return modelAndView;
    }
}
