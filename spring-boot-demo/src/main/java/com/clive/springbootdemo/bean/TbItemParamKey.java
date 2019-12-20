package com.clive.springbootdemo.bean;

public class TbItemParamKey {
    private Long id;
    private String paramName;
    private Long groupId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    @Override
    public String toString() {
        return "TbItemParamKey{" +
                "id=" + id +
                ", paramName='" + paramName + '\'' +
                ", groupId=" + groupId +
                '}';
    }
}
