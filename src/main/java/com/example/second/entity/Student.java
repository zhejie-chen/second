package com.example.second.entity;

public class Student {

    private Long uid;

    private String name;

    private Integer age;

    private String sex;

    private String relation;

    private String img;

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getRelation() { return relation;}

    public void setRelation(String relation) { this.relation = relation == null ? null : relation.trim(); }

    public String getImg() { return img;}

    public void setImg(String img) { this.img = img == null ? null : img.trim(); }
}
