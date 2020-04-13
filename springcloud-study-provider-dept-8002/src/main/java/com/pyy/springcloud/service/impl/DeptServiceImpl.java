package com.pyy.springcloud.service.impl;

import com.pyy.springcloud.dao.DeptDao;
import com.pyy.springcloud.entities.DeptEntity;
import com.pyy.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author panyangyi
 * @create 2020/4/9 11:30
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    /**
     * 插入
     *
     * @param deptEntity
     * @return
     */
    @Override
    public boolean addDept(DeptEntity deptEntity) {
        return deptDao.addDept(deptEntity);
    }

    /**
     * 根据id查找
     *
     * @param deptNo
     * @return
     */
    @Override
    public DeptEntity findById(Long deptNo) {
        return deptDao.findById(deptNo);
    }

    /**
     * 查询全部
     *
     * @return
     */
    @Override
    public List<DeptEntity> findAll() {
        return deptDao.findAll();
    }
}
