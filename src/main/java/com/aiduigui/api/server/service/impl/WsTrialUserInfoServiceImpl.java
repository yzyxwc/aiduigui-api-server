package com.aiduigui.api.server.service.impl;

import com.aiduigui.api.server.entity.WsTrialUserInfo;
import com.aiduigui.api.server.mapper.WsTrialUserInfoMapper;
import com.aiduigui.api.server.service.WsTrialUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author koal_wc
 * @description
 * @date create at 2022/3/3 16:41
 */
@Service
public class WsTrialUserInfoServiceImpl implements WsTrialUserInfoService {
    @Autowired
    WsTrialUserInfoMapper wsTrialUserInfoMapper;
    @Override
    public int insert(WsTrialUserInfo record) {
        return wsTrialUserInfoMapper.insert(record);
    }
}
