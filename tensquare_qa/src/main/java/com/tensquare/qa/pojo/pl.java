package com.tensquare.qa.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @program: tensquare_parent
 * @description: 创建中间表pl的实体
 * @author: Ming.Li
 * @create: 2019-02-26 17:13
 **/
@Entity
@Table(name="tb_pl")
public class pl implements Serializable{
    @Id
    private String problemid;
    @Id
    private String lableid;
    public String getLableid() {
        return lableid;
    }
    public void setLableid(String lableid) {
        this.lableid = lableid;
    }
    public String getProblemid() {
        return problemid;
    }
    public void setProblemid(String problemid) {
        this.problemid = problemid;
    }
}
