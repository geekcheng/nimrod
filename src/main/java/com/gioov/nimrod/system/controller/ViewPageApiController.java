package com.gioov.nimrod.system.controller;

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
@RequestMapping(Page.System.VIEW_PAGE_API)
public class ViewPageApiController {

    @PreAuthorize("hasRole('" + SYSTEM_ADMIN + "') OR hasAuthority('/SYSTEM/VIEW_PAGE_API/PAGE_ALL')")
    @RequestMapping("/page_all")
    public String pageAll() {
        return Page.System.VIEW_PAGE_API + "/page_all";
    }

}
