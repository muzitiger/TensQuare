package com.tensquare.base.dao;

import com.tensquare.base.pojo.Label;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @program: tensquare_parent
 * @description: 标签数据访问接口
 * @author: Ming.Li
 * @create: 2019-01-07 17:56
 **/
public interface LabelDao extends JpaRepository<Label, String>, JpaSpecificationExecutor<Label> {

}
