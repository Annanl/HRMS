package com.hrms.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hrms.pojo.Employment;
import com.hrms.service.EmploymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("employment")
public class EmploymentController {
    @Autowired
    private EmploymentService employmentService;
    @RequestMapping("update")
    @ResponseBody
    public String Update(@RequestBody Employment employment){
        employmentService.updateByPrimaryKeySelective(employment);
        return "1";
    }
    @RequestMapping("insert")
    @ResponseBody
    public String Insert(@RequestBody Employment employment){
        employmentService.insertSelective(employment);
        return "1";
    }
    @RequestMapping("delete")
    @ResponseBody
    public String Delete(@RequestBody Employment employment){
        employmentService.deleteByPrimaryKey(employment.getEid());
        return "1";
    }
    @RequestMapping("findEmployment")
    @ResponseBody
    public Employment FindEmployment(@RequestBody Employment employment){
        return employmentService.selectByPrimaryKeySelective(employment);
    }
    @RequestMapping("listEmployment")
    @ResponseBody
    public List<Employment> ListEmployment(){
        return employmentService.selectByExample(null);
    }
    @RequestMapping("pageList")
    @ResponseBody
    public PageInfo<Employment> PageStaff(PageInfo<Employment> pageInfo){
        if(pageInfo!=null)
            PageHelper.startPage(pageInfo.getPageNum(),pageInfo.getPageSize());
        else
            PageHelper.startPage(1,10);
        List<Employment> employmentList=employmentService.selectByExample(null);
        pageInfo=new PageInfo<Employment>(employmentList);
        return pageInfo;
    }
    @RequestMapping("findAllEmploymentInfo")
    @ResponseBody
    public List<Map<String,Object>> FindAllEmploymentInfo(){
        return employmentService.findAllEmploymentInfo();
    }
}
