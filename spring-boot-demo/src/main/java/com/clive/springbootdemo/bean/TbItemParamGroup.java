package com.clive.springbootdemo.bean;

import java.util.List;

public class TbItemParamGroup {
    private Long id;
    private String groupName;
    private Long itemCatId;
    private List<TbItemParamKey> paramKeyList;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getGroupName() {
        return groupName;
    }
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    public Long getItemCatId() {
        return itemCatId;
    }
    public void setItemCatId(Long itemCatId) {
        this.itemCatId = itemCatId;
    }

    public List<TbItemParamKey> getParamKeyList() {
        return paramKeyList;
    }

    public void setParamKeyList(List<TbItemParamKey> paramKeyList) {
        this.paramKeyList = paramKeyList;
    }

    @Override
    public String toString() {
        return "TbItemParamGroup{" +
                "id=" + id +
                ", groupName='" + groupName + '\'' +
                ", itemCatId=" + itemCatId +
                '}';
    }
}
