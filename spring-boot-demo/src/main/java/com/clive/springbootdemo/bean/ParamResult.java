package com.clive.springbootdemo.bean;

public class ParamResult {
    private String groupName;
    private Long paramId;
    private String paramName;

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Long getParamId() {
        return paramId;
    }

    public void setParamId(Long paramId) {
        this.paramId = paramId;
    }

    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    @Override
    public String toString() {
        return "ParamResult{" +
                "groupName='" + groupName + '\'' +
                ", paramId=" + paramId +
                ", paramName='" + paramName + '\'' +
                '}';
    }
}
