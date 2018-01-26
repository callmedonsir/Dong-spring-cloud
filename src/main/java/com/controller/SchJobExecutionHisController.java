package com.controller;

import com.dao.SchJobExecutionHisMapper;
import com.entity.SchJobExecutionHis;
import com.service.ISchJobExecutionHisService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;

@Api(tags = "调度作业执行历史")
@RestController
@RequestMapping("/scheduler")
public class SchJobExecutionHisController {

    @Autowired
    private ISchJobExecutionHisService iSchJobExecutionHisService;

    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",dataType = "int",value = "序列号",paramType = "query",required = false)
    })

    @ApiOperation(value = "查询作业执行历史",response = SchJobExecutionHis.class)
    @RequestMapping(value = "/jobExecutionsHis",method = RequestMethod.GET)
    public Object get(@ApiIgnore SchJobExecutionHis schJobExecutionHis){
        List<SchJobExecutionHis> schJobExecutionHisList = iSchJobExecutionHisService.query();
        return schJobExecutionHisList;
    }

    @ApiOperation(value="新增作业执行历史",response = Integer.class)
    @RequestMapping(value = "/jobExecutionsHis",method = RequestMethod.POST)
    public Object post(@RequestBody SchJobExecutionHis schJobExecutionHis){
        int record = iSchJobExecutionHisService.insert(schJobExecutionHis);
        if(record==0){
            return "failed";
        }
        return "success";
    }

    @ApiOperation(value ="删除作业执行历史",response = Integer.class)
    @RequestMapping(value = "/jobExecutionsHis/{id}",method = RequestMethod.DELETE)
    public Object delete(@PathVariable int id){
        int record = iSchJobExecutionHisService.delete(id);
        if(record==0){
            return "failed";
        }
        return "success";
    }

    @ApiOperation(value = "修改作业执行历史",response = SchJobExecutionHis.class)
    @RequestMapping(value = "/jobExecutionsHis/{id}",method = RequestMethod.PUT)
    public Object update(@RequestBody SchJobExecutionHis schJobExecutionHis){
        int record = iSchJobExecutionHisService.update(schJobExecutionHis);
        if(record==0){
            return "failed";
        }
        return "success";
    }
}
