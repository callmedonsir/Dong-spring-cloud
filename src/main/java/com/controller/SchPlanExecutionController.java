package com.controller;

import com.dao.SchPlanExecutionMapper;
import com.entity.SchPlanExecution;
import com.service.ISchPlanExecutionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;

@Api(tags = "调度计划执行")
@RestController
@RequestMapping("/scheduler")
public class SchPlanExecutionController {
    @Autowired
    private ISchPlanExecutionService iSchPlanExecutionService;

    @ApiOperation(value = "查询调度计划",response = SchPlanExecution.class)
    @RequestMapping(value = "/planExecutions",method = RequestMethod.GET)
    public Object query(@ApiIgnore SchPlanExecution schPlanExecution){
        List<SchPlanExecution> schPlanExecutionList = iSchPlanExecutionService.query();
        return schPlanExecutionList;
    }

    @ApiOperation(value = "新增调度计划",response = Integer.class)
    @RequestMapping(value = "/planExecutions",method = RequestMethod.POST)
    public Object insert(@RequestBody SchPlanExecution schPlanExecution){
        int record = iSchPlanExecutionService.insert(schPlanExecution);
        if(record ==0){
            return "faild";
        }
        return "success";
    }

    @ApiOperation(value = "删除调度计划",response = Integer.class)
    @RequestMapping(value = "/planExecutions/{id}",method = RequestMethod.DELETE)
    public Object delete(@PathVariable int id){
        int record = iSchPlanExecutionService.delete(id);
        if(record ==0){
            return "faild"; }
        return "success";
    }

    @ApiOperation(value = "修改调度计划",response = SchPlanExecution.class)
    @RequestMapping(value = "/planExecutions/{id}",method = RequestMethod.PUT)
    public Object update(@RequestBody SchPlanExecution schJobRelation){
        int record = iSchPlanExecutionService.update(schJobRelation);
        if(record ==0){
            return "faild";
        }
        return "success";
    }
}
