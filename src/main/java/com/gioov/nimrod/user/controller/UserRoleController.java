package com.gioov.nimrod.user.controller;

import com.gioov.nimrod.common.constant.Page;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static com.gioov.nimrod.user.service.UserService.SYSTEM_ADMIN;

/**
 * @author godcheese
 * @date 2018/2/22
 */
@Controller
@RequestMapping(Page.User.USER_ROLE)
public class UserRoleController {

    @PreAuthorize("hasRole('" + SYSTEM_ADMIN + "') OR hasAuthority('/USER/USER_ROLE/PAGE_ALL')")
    @RequestMapping("/page_all")
    public String pageAll() {
        return Page.User.USER_ROLE + "/page_all";
    }

    @PreAuthorize("isAuthenticated()")
    @RequestMapping("/add_dialog")
    public String addDialog() {
        return Page.User.USER_ROLE + "/add_dialog";
    }

}
