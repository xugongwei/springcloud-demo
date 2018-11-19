package cn.ibona.springcloudprojectprovider8081.service.impl;

import cn.ibona.springcloudcommons.entity.Project;
import cn.ibona.springcloudprojectprovider8081.mapper.ProjectMapper;
import cn.ibona.springcloudprojectprovider8081.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

    private final ProjectMapper projectMapper;

    @Autowired
    public ProjectServiceImpl(ProjectMapper projectMapper) {
        this.projectMapper = projectMapper;
    }

    @Override
    public List<Project> listProject() {
        return projectMapper.listProject();
    }

    @Override
    public Project selectByProjectId(Integer id) {
        return projectMapper.selectByProjectId(id);
    }

    @Override
    public Project selectByProjectName(String name) {
        return projectMapper.selectByProjectName(name);
    }
}
