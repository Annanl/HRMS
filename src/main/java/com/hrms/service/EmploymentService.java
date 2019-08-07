package com.hrms.service;

import com.hrms.pojo.Employment;
import com.hrms.pojo.EmploymentExample;

import java.util.List;
import java.util.Map;

public interface EmploymentService {
    int updateByPrimaryKeySelective(Employment record);
    List<Employment> selectByExample(EmploymentExample example);
    Employment selectByPrimaryKeySelective(Employment employment);
    List<Map<String,Object>> findAllEmploymentInfo();
    int insertSelective(Employment record);
    int deleteByPrimaryKey(Integer eid);
}
