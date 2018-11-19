package cn.ibona.springcloudprojectproviderhystrix8081.controller;

import cn.ibona.springcloudcommons.entity.Project;
import cn.ibona.springcloudprojectproviderhystrix8081.service.ProjectService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/project")
public class ProjectController {

    private final ProjectService projectService;

    @Autowired
    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping("/list")
    public List<Project> list() {
        System.out.println("8083");

        return projectService.listProject();
    }

    @GetMapping("/get/{id}")
    @HystrixCommand(fallbackMethod = "processHystrixGetByID")
    public Project get(@PathVariable("id") Integer id) {
        System.out.println("8083");
        Project project = projectService.selectByProjectId(id);
        if (project == null) {
            throw new RuntimeException("该id：" + id + "没有对应的信息");
        }
        return project;
    }

    public Project processHystrixGetByID(@PathVariable("id") Integer id) {
        return new Project().setId(id).setProjectName("该id：" + id + "没有对应的信息");
    }

    @GetMapping("/get")
    public Project get(@RequestParam("name") String name) {
        System.out.println("8083");

        return projectService.selectByProjectName(name);
    }

}
