package com.controller;

import com.dao.SchSubJobExecutionMapper;
import com.entity.SchSubJobExecution;
import com.service.ISchSubJobExecutionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;

@Api(tags = "调度子作业执行")
@RestController
@RequestMapping("/scheduler")
public class SchSubJobExecutionController {
    @Autowired
    private ISchSubJobExecutionService iSchSubJobExecutionService;

    @ApiOperation(value = "查询调度子作业执行",response = SchSubJobExecution.class)
    @RequestMapping(value = "/subjobExecutions",method = RequestMethod.GET)
    public Object query(@ApiIgnore SchSubJobExecution schSubJobExecution){
        List<SchSubJobExecution> schSubJobExecutionList = iSchSubJobExecutionService.query();
        return schSubJobExecutionList;
    }

    @ApiOperation(value = "新增调度子作业执行",response = Integer.class)
    @RequestMapping(value = "/subjobExecutions",method = RequestMethod.POST)
    public Object insert(@RequestBody SchSubJobExecution schSubJobExecution){
        int record = iSchSubJobExecutionService.insert(schSubJobExecution);
        if(record ==0){
            return "faild";
        }
        return "success";
    }

    @ApiOperation(value = "删除调度子作业执行",response = Integer.class)
    @RequestMapping(value = "/subjobExecutions/{id}",method = RequestMethod.DELETE)
    public Object delete(@PathVariable int id){
        int record = iSchSubJobExecutionService.delete(id);
        if(record ==0){
            return "faild"; }
        return "success";
    }

    @ApiOperation(value = "修改调度子作业执行",response = SchSubJobExecution.class)
    @RequestMapping(value = "/subjobExecutions/{id}",method = RequestMethod.PUT)
    public Object update(@RequestBody SchSubJobExecution schSubJobExecution){
        int record = iSchSubJobExecutionService.update(schSubJobExecution);
        if(record ==0){
            return "faild";
        }
        return "success";
    }
}
