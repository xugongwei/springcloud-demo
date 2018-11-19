package cn.ibona.springcloudprojectprovider8081;

import cn.ibona.springcloudcommons.entity.Project;
import cn.ibona.springcloudprojectprovider8081.mapper.ProjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringcloudProjectProvider8081ApplicationTests {

    @Autowired
    private ProjectMapper projectMapper;

    @Test
    public void contextLoads() {

        Project project = projectMapper.selectByProjectId(1);
        System.out.println(project);
    }

}
