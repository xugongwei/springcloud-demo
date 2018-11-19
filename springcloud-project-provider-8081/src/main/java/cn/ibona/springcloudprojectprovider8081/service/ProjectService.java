package cn.ibona.springcloudprojectprovider8081.service;

import cn.ibona.springcloudcommons.entity.Project;

import java.util.List;

public interface ProjectService {

    List<Project> listProject();

    Project selectByProjectId(Integer id);

    Project selectByProjectName(String name);
}
