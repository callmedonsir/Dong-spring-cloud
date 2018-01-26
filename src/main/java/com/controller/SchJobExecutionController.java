package com.controller;

import com.dao.SchJobExecutionMapper;
import com.entity.SchJobExecution;
import com.service.ISchJobExecutionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;

@Api(tags = "调度作业执行")
@RestController
@RequestMapping("/scheduler")
public class SchJobExecutionController {

    @Autowired
    private ISchJobExecutionService iSchJobExecutionService;

    @ApiOperation(value = "查询作业执行信息",response = SchJobExecution.class   )
    @RequestMapping(value = "/jobExecutions",method = RequestMethod.GET)
    public Object get(@ApiIgnore SchJobExecution schJobExecution){
        List<SchJobExecution> schJobExecutionList = iSchJobExecutionService.query();
        return schJobExecutionList;
    }

    @ApiOperation(value = "新增作业执行信息",response = Integer.class)
    @RequestMapping(value = "/jobExecutions",method = RequestMethod.POST)
    public Object post(@RequestBody SchJobExecution schJobExecution){
        int  record = iSchJobExecutionService.insert(schJobExecution);
        if(record==0){
            return "failed";
        }
        return "success";
    }

    @ApiOperation(value = "删除作业执行信息",response = SchJobExecution.class)
    @RequestMapping(value = "/jobExecutions/{id}",method = RequestMethod.DELETE)
    public Object delete(@PathVariable int id){
        int record = iSchJobExecutionService.delete(id);
        if(record==0){
            return "failed";
        }
        return "success";
    }

    @ApiOperation(value = "修改作业执行信息",response = SchJobExecution.class)
    @RequestMapping(value = "/jobExecutions/{id}",method = RequestMethod.PUT)
    public Object put(@RequestBody SchJobExecution schJobExecution){
        int record = iSchJobExecutionService.update(schJobExecution);
        if(record==0){
            return "failed";
        }
        return "success";
    }

}
