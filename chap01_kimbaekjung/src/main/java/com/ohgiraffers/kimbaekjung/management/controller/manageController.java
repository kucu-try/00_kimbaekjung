package com.ohgiraffers.kimbaekjung.management.controller;

import com.ohgiraffers.kimbaekjung.management.dto.manageDTO;
import com.ohgiraffers.kimbaekjung.management.service.ManageService;
import com.ohgiraffers.kimbaekjung.school.dto.NotificationDTO;
import com.ohgiraffers.kimbaekjung.school.dto.SchoolDTO;
import com.ohgiraffers.kimbaekjung.school.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
@Controller
@RequestMapping("/management/*")
public class manageController {
    @Autowired
    private ManageService manageService;


    @GetMapping("student_manage")
    public ModelAndView pickName(ModelAndView mv){
        List<manageDTO> picks = manageService.pickName();
        mv.addObject("picks",picks);
        mv.setViewName("/management/student_manage");

        return mv;
    }


}
