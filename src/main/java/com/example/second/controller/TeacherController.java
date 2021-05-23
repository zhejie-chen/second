package com.example.second.controller;


import com.example.second.entity.Teacher;
import com.example.second.service.MenuService;
import com.example.second.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teacher")
@CrossOrigin(allowCredentials = "true")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @Autowired
    MenuService menuService;

    /**
     * 查询所有学生
     */
    @GetMapping("/findAllTeachers")
    public List<Teacher> findAllTeachers() {
        return this.teacherService.findAllTeachers();
    }

    /**
     * 增加学生
     */
    @PostMapping("/addTeacher")
//    public void addTeacher(@RequestBody Teacher teacher) {
//        this.teacherService.addTeacher(teacher);
//    }
    public List<FieldError> addTeacher(@RequestBody Teacher teacher, BindingResult result) {
        if (result.hasErrors()){
            List<FieldError> errors = result.getFieldErrors();
            return errors;
        }else {
            List<FieldError> errors = null;
            this.teacherService.addTeacher(teacher);
            return errors;
        }
}
    /**
     * 根据学生id删除学生
     */
    @PostMapping("/deleteTeacher")
    public void deleteTeacherById(@RequestParam Long uid) {
        this.teacherService.deleteTeacherById(uid);
    }

    /**
     * 编辑学生
     */
    @PostMapping("/updateTeacher")
    public List<FieldError> updateTeacher(@RequestBody Teacher teacher, BindingResult result) {
        if (result.hasErrors()){
            List<FieldError> errors = result.getFieldErrors();
            return errors;
        }else {
            List<FieldError> errors = null;
            this.teacherService.updateTeacher(teacher);
            return errors;
        }
    }
    /**
     * 根据学生姓名查找学生
     */
    @GetMapping("/findTeacherByName")
    public List<Teacher> findTeacherByName(@RequestParam String name) {
        return this.teacherService.findTeacherByName(name);
    }

    /**
     * 批量删除学生
     */
    @PostMapping("/deleteTeachersByIds")
    public Integer deleteTeachersByIds(Integer[] ids) {
        return this.teacherService.deleteTeachersByIds(ids);
    }
}
