package cn.ibona.springcloudprojectprovider8081.mapper;

import cn.ibona.springcloudcommons.entity.Project;

import java.util.List;

public interface ProjectMapper {

    List<Project> listProject();

    Project selectByProjectId(Integer id);

    Project selectByProjectName(String name);
}
