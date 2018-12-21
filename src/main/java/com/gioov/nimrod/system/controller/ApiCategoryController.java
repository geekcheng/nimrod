package com.gioov.nimrod.system.controller;

import com.gioov.nimrod.common.constant.Page;
import com.gioov.nimrod.common.operationlog.OperationLog;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author godcheese
 * @date 2018/2/22
 */
@Controller
@RequestMapping(Page.System.API_CATEGORY)
public class ApiCategoryController {

    @OperationLog(value = "新增")
    @PreAuthorize("isAuthenticated()")
    @RequestMapping("/add_dialog")
    public String addDialog() {
        return Page.System.API_CATEGORY + "/add_dialog";
    }

    @OperationLog(value = "编辑")
    @PreAuthorize("isAuthenticated()")
    @RequestMapping("/edit_dialog")
    public String editDialog() {
        return Page.System.API_CATEGORY + "/edit_dialog";
    }

}
