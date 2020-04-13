package com.pyy.springcloud.dao;

import com.pyy.springcloud.entities.DeptEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author panyangyi
 * @create 2020/4/9 11:25
 */
@Mapper
public interface DeptDao {

    /**
     * 插入
     * @param deptEntity
     *
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
