package com.aiduigui.api.server.service;

import com.aiduigui.api.server.entity.WsTrialUserInfo;

/**
 * @author koal_wc
 * @description
 * @date create at 2022/3/3 16:39
 */
public interface WsTrialUserInfoService {
    /**
     * 插入
     * @param record
     * @return
     */
    int insert(WsTrialUserInfo record);
}
