package com.aiduigui.api.server.controller;

import com.aiduigui.api.server.entity.WsTrialUserInfo;
import com.aiduigui.api.server.service.WsTrialUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author koal_wc
 * @description
 * @date create at 2022/3/3 15:54
 */
@RestController("v1/user")
public class WsTrialUserInfoController {
    @Autowired
    WsTrialUserInfoService wsTrialUserInfoService;

    @PostMapping("save")
    public int save(@RequestBody WsTrialUserInfo wsTrialUserInfo){
        return wsTrialUserInfoService.insert(wsTrialUserInfo);
    }

}
