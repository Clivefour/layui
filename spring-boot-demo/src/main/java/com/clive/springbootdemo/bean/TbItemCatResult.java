package com.clive.springbootdemo.bean;


import java.util.List;

public class TbItemCatResult {
    private String title;
    private Long id;
    private String field;
    private List<Children> children;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public List<Children> getChildren() {
        return children;
    }

    public void setChildren(List<Children> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "TbItemCatResult{" +
                "title='" + title + '\'' +
                ", id=" + id +
                ", field='" + field + '\'' +
                ", children=" + children +
                '}';
    }
}
