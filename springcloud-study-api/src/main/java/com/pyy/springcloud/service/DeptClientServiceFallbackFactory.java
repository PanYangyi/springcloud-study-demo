package com.pyy.springcloud.service;

import com.pyy.springcloud.entities.DeptEntity;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author panyangyi
 * @create 2020/4/11 23:24
 */
@Component //这个注解必须加上
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {

    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {

            @Override
            public boolean addDept(DeptEntity deptEntity) {
                return false;
            }

            @Override
            public DeptEntity findById(Long deptNo) {
                return new DeptEntity()
                        .setDeptNo(deptNo)
                        .setDeptName("该ID："+deptNo+"没有没有对应的信息,Consumer客户端提供的降级信息,此刻服务Provider已经关闭")
                        .setDbSource("can not extist in MySQL");
            }

            @Override
            public List<DeptEntity> findAll() {
                return null;
            }
        };
    }
}
