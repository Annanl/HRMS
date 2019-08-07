package com.hrms.dao;

import com.hrms.pojo.Staff;
import com.hrms.pojo.StaffExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface StaffMapper {
    int countByExample(StaffExample example);

    int deleteByExample(StaffExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(Staff record);

    int insertSelective(Staff record);

    List<Staff> selectByExample(StaffExample example);

    List<Staff> selectByPrimaryKeySelective(Staff record);

    Staff selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") Staff record, @Param("example") StaffExample example);

    int updateByExample(@Param("record") Staff record, @Param("example") StaffExample example);

    int updateByPrimaryKeySelective(Staff record);

    int updateByPrimaryKey(Staff record);

    Staff selectByLogin(@Param("username") String username, @Param("password") String password);

    Map<String,Object> selectStaffAllInfo(Integer sid);
}