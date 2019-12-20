package com.clive.springbootdemo.bean;

import java.util.List;

public class Children {
    private String title;
    private Long id;
    private String field;
    private boolean fixed;
    private List<ChildrenX> children;

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

    public boolean isFixed() {
        return fixed;
    }

    public void setFixed(boolean fixed) {
        this.fixed = fixed;
    }

    public List<ChildrenX> getChildren() {
        return children;
    }

    public void setChildren(List<ChildrenX> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "Children{" +
                "title='" + title + '\'' +
                ", id=" + id +
                ", field='" + field + '\'' +
                ", fixed=" + fixed +
                ", children=" + children +
                '}';
    }
}
