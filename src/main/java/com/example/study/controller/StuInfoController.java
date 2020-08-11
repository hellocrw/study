package com.example.study.controller;


import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author caorongwu
 * @since 2020-08-11
 */
@Api(tags = {"学习信息接口"})
@RestController
@RequestMapping("/stuInfo")
public class StuInfoController {

    @GetMapping("/study")
    public String study(){
        return "study";
    }

}

