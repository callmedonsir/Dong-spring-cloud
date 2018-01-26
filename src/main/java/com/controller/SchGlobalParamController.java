package com.controller;

import com.entity.SchGlobalParam;
import com.service.ISchGlobalParamService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;

@Api(tags = "调度全局参数列表")
@RestController
@RequestMapping("/scheduler")
public class SchGlobalParamController {

    @Autowired
    private ISchGlobalParamService iSchGlobalParamService;

    @ApiOperation(value = "查询全局参数",response = SchGlobalParam.class)
    @RequestMapping(value = "/globalParams",method = RequestMethod.GET)
    public Object query(@ApiIgnore SchGlobalParam schGlobalParam){
        List<SchGlobalParam> schJobRelationList = iSchGlobalParamService.query(schGlobalParam);
        return schJobRelationList;
    }

    @ApiOperation(value = "新增全局参数",response = Integer.class)
    @RequestMapping(value = "/globalParams",method = RequestMethod.POST)
    public Object insert(@RequestBody SchGlobalParam schGlobalParam){
        int record = iSchGlobalParamService.insert(schGlobalParam);
        if(record ==0){
            return "faild";
        }
        return "success";
    }

    @ApiOperation(value = "删除全局参数",response = Integer.class)
    @RequestMapping(value = "/globalParams/{id}",method = RequestMethod.DELETE)
    public Object delete(@PathVariable int id){
        int record = iSchGlobalParamService.deleteByPrimaryKey(id);
        if(record ==0){
            return "faild"; }
        return "success";
    }

    @ApiOperation(value = "修改全局参数",response = SchGlobalParam.class)
    @RequestMapping(value = "/globalParams/{id}",method = RequestMethod.PUT)
    public Object update(@RequestBody SchGlobalParam schGlobalParam){
        int record = iSchGlobalParamService.updateByPrimaryKey(schGlobalParam);
        if(record ==0){
            return "faild";
        }
        return "success";
    }

}
