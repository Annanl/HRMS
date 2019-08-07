package com.hrms.dao;

import com.hrms.pojo.Employment;
import com.hrms.pojo.EmploymentExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface EmploymentMapper {
    int countByExample(EmploymentExample example);

    int deleteByExample(EmploymentExample example);

    int deleteByPrimaryKey(Integer eid);

    int insert(Employment record);

    int insertSelective(Employment record);

    List<Employment> selectByExample(EmploymentExample example);

    Employment selectByPrimaryKeySelective(Employment employment);

    int updateByExampleSelective(@Param("record") Employment record, @Param("example") EmploymentExample example);

    int updateByExample(@Param("record") Employment record, @Param("example") EmploymentExample example);

    int updateByPrimaryKeySelective(Employment record);

    int updateByPrimaryKey(Employment record);

    List<Map<String,Object>> findAllEmploymentInfo();
}