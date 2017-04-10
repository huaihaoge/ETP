package com.thunisoft.chenh.entityExcel.controller;

import javax.annotation.Resource;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.thunisoft.chenh.entityExcel.pojo.User;
import com.thunisoft.chenh.entityExcel.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private IUserService userService;

    @RequestMapping("/showUser")
    public String toIndex(HttpServletRequest request, Model model) {
        int userID = Integer.parseInt(request.getParameter("id"));
        User user = this.userService.getUserById(userID);
        model.addAttribute("user", user);
        return "showUser";
    }

}
