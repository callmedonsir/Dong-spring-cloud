package com.controller;


import com.dao.SchJobRelationMapper;
import com.entity.SchJobRelation;
import com.service.ISchJobRelationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;

@Api(tags = "调度作业关系")
@RestController
@RequestMapping("/scheduler")
public class SchJobRelationController {

    @Autowired
    private ISchJobRelationService iSchJobRelationService;

    @ApiOperation(value = "查询作业关系",response = SchJobRelation.class)
    @RequestMapping(value = "/jobRelations",method = RequestMethod.GET)
    public Object query(@ApiIgnore SchJobRelation schJobRelation){
        List<SchJobRelation> schJobRelationList = iSchJobRelationService.query();
        return schJobRelationList;
    }

    @ApiOperation(value = "新增作业关系",response = Integer.class)
    @RequestMapping(value = "/jobRelations",method = RequestMethod.POST)
    public Object insert(@RequestBody SchJobRelation schJobRelation){
        int record = iSchJobRelationService.insert(schJobRelation);
        if(record ==0){
            return "faild";
        }
        return "success";
    }

    @ApiOperation(value = "删除作业关系",response = Integer.class)
    @RequestMapping(value = "/jobRelations/{id}",method = RequestMethod.DELETE)
    public Object delete(@PathVariable int id){
        int record = iSchJobRelationService.delete(id);
        if(record ==0){
            return "faild"; }
        return "success";
    }

    @ApiOperation(value = "修改作业关系",response = SchJobRelation.class)
    @RequestMapping(value = "/jobRelations/{id}",method = RequestMethod.PUT)
    public Object update(@RequestBody SchJobRelation schJobRelation){
        int record = iSchJobRelationService.update(schJobRelation);
        if(record ==0){
            return "faild";
        }
        return "success";
    }

}
