package com.aiduigui.api.server.mapper;

import com.aiduigui.api.server.entity.WsTrialUserInfo;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface WsTrialUserInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WsTrialUserInfo record);

    int insertSelective(WsTrialUserInfo record);

    WsTrialUserInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WsTrialUserInfo record);

    int updateByPrimaryKey(WsTrialUserInfo record);
}
