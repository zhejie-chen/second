package com.example.second.entity;
import javax.validation.constraints.*;
public class Teacher {

    private Long uid;
    @NotNull(message="姓名不能为空")
    @Pattern(regexp="^[\\u4e00-\\u9fa5]+$",message = "请输入不含空格的中文名")
    @Size(min = 2, message = "姓名不能少于2个字")
    @Size(max = 5, message = "姓名不能多于5个字")
    private String name;
    @NotNull(message = "年龄不能为空")
    @Min(value = 20, message = "年龄必须大于20岁")
    @Max(value = 60, message = "年龄必须小于60岁")
    private Integer age;
    @NotNull(message = "性别不能为空")
    private String sex;
    @NotNull(message = "学校不能为空")
    private  String school;
    @NotNull(message = "学院不能为空")
    private  String college;
    @NotNull(message = "职位不能为空")
    private  String post;
    private  String address;
    @NotNull(message = "电话不能为空")
    private  String telnum;

    private  String wechat;

    private  String qq;
    private  String email;
    @NotNull(message = "学历背景不能为空")
    private  String background;
    private  String entry;
    private  String relation;
    private  String children;
    @NotNull(message = "联系人电话不能为空")
    private  String linkman;
    private  String birthday;
    private  String favorite;
    private  String assessment;


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

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) { this.school = school == null ? null : school.trim(); }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) { this.college = college == null ? null : college.trim(); }

    public String getPost() {
        return post;
    }

    public void setPost(String post) { this.post = post == null ? null : post.trim(); }

    public String getAddress() { return address; }

    public void setAddress(String address) { this.address = address == null ? null : address.trim(); }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) { this.wechat = wechat == null ? null : wechat.trim(); }

    public String getTelnum() {
        return telnum;
    }

    public void setTelnum(String telnum) {
        this.telnum = telnum;
    }

    public String getQq() {
        return qq;
    }
    public void setQq(String qq) { this.qq = qq == null ? null : qq.trim(); }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) { this.email = email == null ? null : email.trim(); }

    public String getBackground() {
        return background;
    }
    public void setBackground(String background) { this.background = background == null ? null : background.trim(); }

    public String getEntry() { return entry; }
    public void setEntry(String entry) { this.entry = entry; }

    public String getRelation() { return relation; }
    public void setRelation(String relation) { this.relation = relation; }

    public String getChildren() { return children; }
    public void setChildren(String children) { this.children = children; }

    public String getLinkman() { return linkman; }
    public void setLinkman(String linkman) { this.linkman = linkman; }

    public String getBirthday() { return birthday; }
    public void setBirthday(String birthday) { this.birthday = birthday; }

    public String getFavorite() { return favorite; }
    public void setFavorite(String favorite) { this.favorite = favorite; }

    public String getAssessment() { return assessment; }
    public void setAssessment(String assessment) { this.assessment = assessment; }

}
