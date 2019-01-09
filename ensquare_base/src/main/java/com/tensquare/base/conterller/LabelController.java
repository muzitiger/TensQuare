package com.tensquare.base.conterller;

import com.tensquare.base.pojo.Label;
import com.tensquare.base.service.LabelService;
import entity.Result;
import entity.StatusCode;
import jdk.net.SocketFlow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: tensquare_parent
 * @description: 标签控制控制层
 * @author: Ming.Li
 * @create: 2019-01-08 09:07
 **/
@RestController
@RequestMapping("/label")
public class LabelController {
    @Autowired
    private LabelService labelService;
    /** 
    * @Description: 查询所有 
    * @Param: [] 
    * @return: entity.Result 
    */ 
    @RequestMapping(method = RequestMethod.GET)
    public Result findAll(){
        return new Result(true,StatusCode.OK,"查询成功",
                labelService.findAll() );
    }
    /** 
    * @Description: 根据id查询
    * @Param: [id] 
    * @return: entity.Result 
    */ 
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Result findById(@PathVariable String id){
        return new Result(true, StatusCode.OK, "查询成功",labelService.findById(id));
    }

    @RequestMapping(method = RequestMethod.POST)
    public Result add(@RequestBody Label label){

          return new Result(true,StatusCode.OK,"增加成功");
    }

    /**
     * 修改标签
     * @param label
     * @return
     */
    @RequestMapping(value="/{id}" ,method = RequestMethod.PUT)
    public Result update( @RequestBody Label label,@PathVariable String
            id){
        label.setId(id);
        labelService.update(label);
        return new Result(true,StatusCode.OK,"修改成功");
    }
    /**
     * 删除标签
     * @param id
     * @return
     */
    @RequestMapping(value="/{id}" ,method = RequestMethod.DELETE)
    public Result deleteById(@PathVariable String id){
        labelService.deleteById(id);
        return new Result(true,StatusCode.OK,"删除成功");
    }

}
