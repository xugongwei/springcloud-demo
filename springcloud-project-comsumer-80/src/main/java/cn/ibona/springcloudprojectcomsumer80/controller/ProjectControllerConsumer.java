package cn.ibona.springcloudprojectcomsumer80.controller;

import cn.ibona.springcloudcommons.entity.Project;
import cn.ibona.springcloudcommons.util.Result;
import cn.ibona.springcloudprojectcomsumer80.service.ProjectClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProjectControllerConsumer {

    private final ProjectClientService clientService;

    @Autowired
    public ProjectControllerConsumer(ProjectClientService clientService) {
        this.clientService = clientService;
    }

    @RequestMapping("/list")
    public Result list() {
        List<Project> projectList = clientService.listProject();
        return Result.success("操作成功").put("projectList", projectList);
    }

    @RequestMapping("/get/{id}")
    public Result get(@PathVariable("id") Integer id) {
        Project project = clientService.selectByProjectId(id);
        return Result.success("操作成功").put("project", project);
    }

    @RequestMapping("/get")
    public Result get(@RequestParam("name") String name) {
        Project project = clientService.selectByProjectName(name);
        return Result.success("操作成功").put("project", project);
    }
}
