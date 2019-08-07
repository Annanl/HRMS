package com.hrms.serviceImpl;

import com.hrms.dao.EmploymentMapper;
import com.hrms.pojo.Employment;
import com.hrms.pojo.EmploymentExample;
import com.hrms.service.EmploymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class EmploymentServiceImpl implements EmploymentService {
    @Autowired
    private EmploymentMapper employmentMapper;
    @Override
    public int updateByPrimaryKeySelective(Employment record) {
        return employmentMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<Employment> selectByExample(EmploymentExample example) {
        return employmentMapper.selectByExample(example);
    }

    @Override
    public Employment selectByPrimaryKeySelective(Employment employment) {
        return employmentMapper.selectByPrimaryKeySelective(employment);
    }

    @Override
    public List<Map<String,Object>> findAllEmploymentInfo() {
        return employmentMapper.findAllEmploymentInfo();
    }

    @Override
    public int insertSelective(Employment record) {
        return employmentMapper.insertSelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer eid) {
        return employmentMapper.deleteByPrimaryKey(eid);
    }
}
