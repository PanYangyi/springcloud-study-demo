package com.pyy.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.pyy.springcloud.entities.DeptEntity;
import com.pyy.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author panyangyi
 * @create 2020/4/9 11:33
 */
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;


    @RequestMapping(value = "/dept/add",method = RequestMethod.POST)
    public boolean addDept(@RequestBody DeptEntity deptEntity) {
        return deptService.addDept(deptEntity);
    }



    @RequestMapping(value = "/dept/findById/{deptNo}",method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public DeptEntity findById(@PathVariable(value = "deptNo") Long deptNo) {

        DeptEntity deptEntity = deptService.findById(deptNo);
        if (deptEntity == null)
            throw new RuntimeException("id:{}不存在！"+deptNo);

        return deptEntity;
    }

    public DeptEntity processHystrix_Get(@PathVariable(value = "deptNo") Long deptNo){
        return new DeptEntity().setDeptNo(deptNo).setDeptName("该id"+deptNo+"没有对应的信息，null---@HystrixCommand")
                .setDbSource("no this database in MySql");
    }



    @RequestMapping(value = "/dept/findAll",method = RequestMethod.GET)
    public List<DeptEntity> findAll() {
        return deptService.findAll();
    }
}
