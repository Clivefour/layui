package com.clive.springbootdemo.bean;

public class ChildrenX {
    private String title;
    private Long id;
    private String field;

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

    @Override
    public String toString() {
        return "ChildrenX{" +
                "title='" + title + '\'' +
                ", id=" + id +
                ", field='" + field + '\'' +
                '}';
    }
}
