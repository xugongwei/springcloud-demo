package cn.ibona.springcloudprojectcomsumer80.service;

import cn.ibona.springcloudcommons.entity.Project;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProjectClientServiceFallbackFactory implements FallbackFactory<ProjectClientService> {

    @Override
    public ProjectClientService create(Throwable throwable) {
        return new ProjectClientService() {
            @Override
            public List<Project> listProject() {
                return null;
            }

            @Override
            public Project selectByProjectId(Integer id) {
                return new Project()
                        .setId(id)
                        .setProjectName("该id:"+id+"没有找到对应的信息，consumer客户端提供的降级信息，此刻服务provider已经关闭")
                        .setProjectDesc("没有该项目的描述")
                        .setProjectPrincipal("没有对应的联系人");
            }

            @Override
            public Project selectByProjectName(String name) {
                return null;
            }
        };
    }
}
