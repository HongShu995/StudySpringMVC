package com.hongshu.service.impl;

import com.hongshu.dao.StudentDao;
import com.hongshu.entity.Student;
import com.hongshu.service.StudentService;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService
{
    @Resource
    private StudentDao studentDao;

    @Override
    public int addStudent(Student student)
    {
        int nums =studentDao.insertStudent(student);
        return nums;
    }

    @Override
    public List<Student> findStudents()
    {
        return studentDao.selectStudents();
    }
}
