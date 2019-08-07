package com.hrms.serviceImpl;

import com.hrms.dao.DepartmentMapper;
import com.hrms.pojo.Department;
import com.hrms.pojo.DepartmentExample;
import com.hrms.pojo.Staff;
import com.hrms.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentMapper departmentMapper;
    @Override
    public int insertSelective(Department record) {
        return departmentMapper.insertSelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer pid) {
        return departmentMapper.deleteByPrimaryKey(pid);
    }

    @Override
    public List<Department> selectByExample(DepartmentExample example) {
        return departmentMapper.selectByExample(example);
    }

    @Override
    public Department selectByPrimaryKey(Integer pid) {
        return departmentMapper.selectByPrimaryKey(pid);
    }

    @Override
    public int updateByPrimaryKeySelective(Department record) {
        return departmentMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Map<String, Object>> selectManagersByPosition(Staff staff) {
        return departmentMapper.selectManagersByPosition(staff);
    }
}
