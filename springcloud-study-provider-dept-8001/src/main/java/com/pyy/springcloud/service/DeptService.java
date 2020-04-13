package com.pyy.springcloud.service;

import com.pyy.springcloud.entities.DeptEntity;

import java.util.List;

/**
 * @Author panyangyi
 * @create 2020/4/9 11:30
 */
public interface DeptService {

    /**
     * 插入
     * @param deptEntity
     * @return
     */
    boolean addDept(DeptEntity deptEntity);

    /**
     * 根据id查找
     * @param deptNo
     * @return
     */
    DeptEntity findById(Long deptNo);

    /**
     * 查询全部
     * @return
     */
    List<DeptEntity> findAll();
}
