package com.tensquare.base.service;

import com.tensquare.base.dao.LabelDao;
import com.tensquare.base.pojo.Label;
import entity.Result;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.util.StringUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import util.IdWorker;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @program: tensquare_parent
 * @description: 基本增删改查
 * @author: Ming.Li
 * @create: 2019-01-07 17:59
 **/
@Service
public class LabelService {

    @Autowired
    private LabelDao labelDao;
    @Autowired
    private IdWorker idWorker;


    /**
     * 查询全部标签
     * @return
     */
    public List<Label> findAll(){
        return labelDao.findAll();
    }
    /**
     * 根据ID查询标签
     * @return
     */
    public Label findById(String id){
        return labelDao.findById(id).get();
    }
    /**
     * 增加标签
     * @param label
     */

    public void add(Label label){
        label.setId( idWorker.nextId()+"" );//设置ID
        labelDao.save(label);
    }
    /**
     * 修改标签
     * @param label
     */
    public void update(Label label){
        labelDao.save(label);
    }
    /**
     * 删除标签
     * @param id
     */
    public void deleteById(String id){
        labelDao.deleteById(id);
    }

    /***
    * @Description:  条件查询
    * @Param: [label]
    * @return: entity.Result
    */
    public List<Label> findSerch(Label label) {
        //匿名内部类的方式处理得到的对象传给Specification
        return labelDao.findAll(new Specification<Label>(){
            @Override
            public Predicate toPredicate(Root<Label> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder cb) {
                List<Predicate> predicateList=new ArrayList<>();

                if(root.get("labelname")!=null &&!"".equals(root.get("labelname"))){
                    predicateList.add(cb.like(root.get("labelname").as(String.class), "%"+ root.get("labelname")+"%" ) );
                }
                if(root.get("state")!=null &&
                        !"".equals(root.get("state"))){
                    predicateList.add(cb.equal(
                            root.get("state").as(String.class), root.get("state") ) );
                }
                if(root.get("recommend")!=null &&
                        !"".equals(root.get("recommend"))){
                    predicateList.add(cb.equal(
                            root.get("recommend").as(String.class),
                            root.get("recommend") ) );
                }
                return cb.and( predicateList.toArray( new
                        Predicate[predicateList.size()]) );


            }
        });
    }

    /**
     * 分页条件查询
     * @param label
     * @param page
     * @param size
     * @return
     */
    public Page<Label> findSearch(Label label, int page, int size){
        PageRequest pageRequest=PageRequest.of(page-1,size);
        return labelDao.findAll(new Specification<Label>(){
            @Override
            public Predicate toPredicate(Root<Label> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder cb) {
                List<Predicate> predicateList=new ArrayList<>();

                if(root.get("labelname")!=null &&!"".equals(root.get("labelname"))){
                    predicateList.add(cb.like(root.get("labelname").as(String.class), "%"+ root.get("labelname")+"%" ) );
                }
                if(root.get("state")!=null &&
                        !"".equals(root.get("state"))){
                    predicateList.add(cb.equal(
                            root.get("state").as(String.class), root.get("state") ) );
                }
                if(root.get("recommend")!=null &&
                        !"".equals(root.get("recommend"))){
                    predicateList.add(cb.equal(
                            root.get("recommend").as(String.class),
                            root.get("recommend") ) );
                }
                return cb.and( predicateList.toArray( new
                        Predicate[predicateList.size()]) );



            }
        },pageRequest);
    }
}
