package cn.ibona.springcloudprojectcomsumer80.service;

import cn.ibona.springcloudcommons.entity.Project;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "springcloud-project-provider", fallbackFactory = ProjectClientServiceFallbackFactory.class)
public interface ProjectClientService {

    @RequestMapping("/api/project/list")
    List<Project> listProject();

    @RequestMapping("/api/project/get/{id}")
    Project selectByProjectId(@PathVariable("id") Integer id);

    @RequestMapping("/api/project/get")
    Project selectByProjectName(@RequestParam("name") String name);

}
