package com.hrms.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hrms.pojo.Department;
import com.hrms.pojo.Staff;
import com.hrms.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("staff")
public class StaffController {
    @Autowired
    private StaffService staffService;
    @RequestMapping("login")
    @ResponseBody
    public Staff Login(@RequestBody Staff staff, HttpServletRequest request){
        staff=staffService.selectByLogin(staff.getUsername(),staff.getPassword());
        if(staff!=null){
            request.getSession().setAttribute("staff",staff);
        }
        return staff;
    }
    @RequestMapping("insert")
    @ResponseBody
    public String Insert(@RequestBody Staff staff){
        staffService.insertSelective(staff);
        return "1";
    }
    @RequestMapping("delete")
    @ResponseBody
    public String Delete(@RequestBody Staff staff){
        staffService.deleteByPrimaryKey(staff.getSid());
        return "1";
    }
    @RequestMapping("findStaff")
    @ResponseBody
    public Staff FindStaff(@RequestBody Staff staff){
        staff=staffService.selectByPrimaryKey(staff.getSid());
        return staff;
    }
    @RequestMapping("update")
    @ResponseBody
    public String Update(@RequestBody Staff staff){
        staffService.updateByPrimaryKeySelective(staff);
        return "1";
    }
    @RequestMapping("listStaff")
    @ResponseBody
    public List<Staff> ListStaff(){
        List<Staff> staffList=staffService.selectByExample(null);
        return staffList;
    }
    @RequestMapping("pageList")
    @ResponseBody
    public PageInfo<Staff> PageStaff(@RequestBody PageInfo<Staff> pageInfo){
        if(pageInfo!=null)
            PageHelper.startPage(pageInfo.getPageNum(),pageInfo.getPageSize());
        else
            PageHelper.startPage(1,10);
        List<Staff> staffList=staffService.selectByExample(null);
        pageInfo=new PageInfo<Staff>(staffList);
        return pageInfo;
    }
    @RequestMapping("findManager")
    @ResponseBody
    public List<Staff> FindManager(){
        Staff staff=new Staff();
        staff.setPosition("2");
        return staffService.selectByPrimaryKeySelective(staff);
    }
    @RequestMapping("findStaffAllInfo")
    @ResponseBody
    public Map<String, Object> FindStaffAllInfo(@RequestBody Staff staff){
        return staffService.selectStaffAllInfo(staff.getSid());
    }
    @RequestMapping("findAllStaffByDepartmentId")
    @ResponseBody
    public  List<Staff> FindAllStaffsByDepartmentId(@RequestBody Department department){
        Staff staff=new Staff();
        staff.setDepartmentId(department.getPid());
        staff.setPosition("管理员");
        return staffService.selectByPrimaryKeySelective(staff);
    }
}
