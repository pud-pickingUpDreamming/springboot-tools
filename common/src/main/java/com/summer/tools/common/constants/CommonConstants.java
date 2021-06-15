package com.summer.tools.common.constants;

public interface CommonConstants {

    // 请求头用户信息
    String CURRENT_USER_NAME = "currentUserName";
    String CURRENT_USER_ID = "currentUserId";
    /**
     * 同一个请求在不同服务之间传递,方便检索
     */
    String REQUEST_KEY = "requestId";

    // 数据记录时间和人
    String CREATE_TIME = "createTime";
    String UPDATE_TIME = "updateTime";
    String CREATOR = "creator";
    String UPDATER = "updater";
    // 泛指成功
    String SUCCESS = "0";
}
