package org.zxl.springbootdemo.shardsphere.jdbctest1.entity;

import java.io.Serializable;

public class UserLog implements Serializable {

    private static final long serialVersionUID = -1205226416664488559L;
    private Integer logId;
    private String logName;
    private Integer userId;
    private String logDesc;

    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    public String getLogName() {
        return logName;
    }

    public void setLogName(String logName) {
        this.logName = logName;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getLogDesc() {
        return logDesc;
    }

    public void setLogDesc(String logDesc) {
        this.logDesc = logDesc;
    }
}
