package com.hrms.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hrms.pojo.Department;
import com.hrms.pojo.Staff;
import com.hrms.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @RequestMapping("insert")
    @ResponseBody
    public String Insert(@RequestBody Department department){
        departmentService.insertSelective(department);
        return "1";
    }
    @RequestMapping("delete")
    @ResponseBody
    public String Delete(@RequestBody Department department){
        departmentService.deleteByPrimaryKey(department.getPid());
        return "1";
    }
    @RequestMapping("update")
    @ResponseBody
    public String Update(@RequestBody Department department){
        departmentService.updateByPrimaryKeySelective(department);
        return "1";
    }
    @RequestMapping("findDepartment")
    @ResponseBody
    public Department FindDepartment(@RequestBody Department department){
        department=departmentService.selectByPrimaryKey(department.getPid());
        return department;
    }
    @RequestMapping("listDepartment")
    @ResponseBody
    public List<Department> listDepartment(){
        List<Department> departmentList=departmentService.selectByExample(null);
        return departmentList;
    }
    @RequestMapping("pageList")
    @ResponseBody
    public PageInfo<Department> PageDepartment(@RequestBody PageInfo<Department> pageInfo){
        if(pageInfo!=null)
            PageHelper.startPage(pageInfo.getPageNum(),pageInfo.getPageSize());
        else
            PageHelper.startPage(1,10);
        List<Department> departmentList=departmentService.selectByExample(null);
        pageInfo=new PageInfo<Department>(departmentList);
        return pageInfo;
    }
    @RequestMapping("managerList")
    @ResponseBody
    public List<Map<String,Object>> ManagerList(@RequestBody List<Map<String,String>> code){
        Staff staff=new Staff();
        List<Map<String,Object>> mapList=new ArrayList<>();
        for (Map<String,String> e:code) {
            for (String position:e.keySet()) {
                staff.setPosition(e.get(position));
                mapList.addAll(departmentService.selectManagersByPosition(staff));
            }
        }
        return  mapList;
    }
}
