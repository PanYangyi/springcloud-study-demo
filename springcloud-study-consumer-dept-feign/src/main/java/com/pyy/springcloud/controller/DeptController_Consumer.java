package com.pyy.springcloud.controller;

import com.pyy.springcloud.entities.DeptEntity;
import com.pyy.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Author panyangyi
 * @create 2020/4/9 14:19
 */
@RestController
@EnableEurekaClient
public class DeptController_Consumer {

/*//    private  final String REST_URL_PROFIX = "http://localhost:8001";
    private  final String REST_URL_PROFIX = "http://STUDY-SPRINGCLOUD-DEPT";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value ="/consumer/dept/add")
    public boolean add (DeptEntity deptEntity) {
        //三个参数：url,requestMap ResponseBean.class
        return restTemplate.postForObject(REST_URL_PROFIX+"/dept/add",deptEntity,Boolean.class);
    }
    @RequestMapping(value = "/consumer/dept/findById/{id}")
    public DeptEntity get(@PathVariable Long id){
        return restTemplate.getForObject(REST_URL_PROFIX+"/dept/findById/"+id,DeptEntity.class);
    }
    @RequestMapping(value = "/consumer/dept/findAll")
    public List<DeptEntity> findAll(){
        return restTemplate.getForObject(REST_URL_PROFIX+"/dept/findAll",List.class);
    }*/


    /**
     * 使用Feign面向接口的编程
     */
    @Autowired
    private DeptClientService deptClientService;

    @RequestMapping(value ="/consumer/dept/add")
    public boolean add (DeptEntity deptEntity) {
        return deptClientService.addDept(deptEntity);
    }
    @RequestMapping(value = "/consumer/dept/findById/{id}")
    public DeptEntity get(@PathVariable Long id){
        return deptClientService.findById(id);
    }
    @RequestMapping(value = "/consumer/dept/findAll")
    public List<DeptEntity> findAll(){
        return deptClientService.findAll();
    }
}
