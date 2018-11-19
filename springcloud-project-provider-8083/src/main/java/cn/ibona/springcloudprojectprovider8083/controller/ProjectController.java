package cn.ibona.springcloudprojectprovider8083.controller;

import cn.ibona.springcloudcommons.entity.Project;
import cn.ibona.springcloudcommons.util.Result;
import cn.ibona.springcloudprojectprovider8083.service.ProjectService;
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
    public Project get(@PathVariable("id") Integer id) {
        System.out.println("8083");

        return projectService.selectByProjectId(id);
    }

    @GetMapping("/get")
    public Project get(@RequestParam("name") String name) {
        System.out.println("8083");

        return projectService.selectByProjectName(name);
    }

}
