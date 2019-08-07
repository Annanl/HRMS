package com.hrms.serviceImpl;

import com.hrms.dao.StaffMapper;
import com.hrms.pojo.Staff;
import com.hrms.pojo.StaffExample;
import com.hrms.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class StaffServiceImpl implements StaffService {
    @Autowired
    private StaffMapper staffMapper;
    @Override
    public List<Staff> selectByExample(StaffExample example) {
        return staffMapper.selectByExample(example);
    }

    @Override
    public Staff selectByLogin(String username, String password) {
        return staffMapper.selectByLogin(username,password);
    }

    @Override
    public int insertSelective(Staff record) {
        return staffMapper.insert(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer sid) {
        return staffMapper.deleteByPrimaryKey(sid);
    }

    @Override
    public int updateByPrimaryKeySelective(Staff record) {
        return staffMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public Staff selectByPrimaryKey(Integer sid) {
        return staffMapper.selectByPrimaryKey(sid);
    }

    @Override
    public List<Staff> selectByPrimaryKeySelective(Staff record) {
        return staffMapper.selectByPrimaryKeySelective(record);
    }

    @Override
    public Map<String, Object> selectStaffAllInfo(Integer sid) {
        return staffMapper.selectStaffAllInfo(sid);
    }
}
