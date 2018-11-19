package cn.ibona.springcloudcommons.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
public class Project implements Serializable {

    private Integer id;

    private String projectName;

    private String projectDesc;

    private String projectPrincipal;

    private String createdTime;

    private Integer isDelete;
}
