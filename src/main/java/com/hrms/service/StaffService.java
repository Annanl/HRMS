package com.hrms.service;

import com.hrms.pojo.Staff;
import com.hrms.pojo.StaffExample;

import java.util.List;
import java.util.Map;

public interface StaffService {
    List<Staff> selectByExample(StaffExample example);
    Staff selectByLogin(String username, String password);
    int insertSelective(Staff record);
    int deleteByPrimaryKey(Integer sid);
    int updateByPrimaryKeySelective(Staff record);
    Staff selectByPrimaryKey(Integer sid);
    List<Staff> selectByPrimaryKeySelective(Staff record);
    Map<String,Object> selectStaffAllInfo(Integer sid);
}
