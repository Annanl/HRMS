package com.hrms.service;

import com.hrms.pojo.Department;
import com.hrms.pojo.DepartmentExample;
import com.hrms.pojo.Staff;

import java.util.List;
import java.util.Map;

public interface DepartmentService {
    int insertSelective(Department record);
    int deleteByPrimaryKey(Integer pid);
    List<Department> selectByExample(DepartmentExample example);
    Department selectByPrimaryKey(Integer pid);
    int updateByPrimaryKeySelective(Department record);
    List<Map<String,Object>> selectManagersByPosition(Staff staff);
}
