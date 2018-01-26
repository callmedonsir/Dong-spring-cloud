package com.controller;

import com.dao.SchSubJobExecutionHisMapper;
import com.entity.SchSubJobExecutionHis;
import com.service.ISchSubJobExecutionHisService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;

@Api(tags = "调度子作业执行历史")
@RestController
@RequestMapping("/scheduler")
public class SchSubJobExecutionHisController {

    @Autowired
    private ISchSubJobExecutionHisService iSchSubJobExecutionHisService;

    @ApiOperation(value = "查询调度子作业执行历史",response = SchSubJobExecutionHis.class)
    @RequestMapping(value = "/subjobExecutionsHis",method = RequestMethod.GET)
    public Object query(@ApiIgnore SchSubJobExecutionHis schSubJobExecutionHis){
        List<SchSubJobExecutionHis> schSubJobExecutionHisList = iSchSubJobExecutionHisService.query();
        return schSubJobExecutionHisList;
    }

    @ApiOperation(value = "新增调度子作业执行历史",response = Integer.class)
    @RequestMapping(value = "/subjobExecutionsHis",method = RequestMethod.POST)
    public Object insert(@RequestBody SchSubJobExecutionHis schJobRelation){
        int record = iSchSubJobExecutionHisService.insert(schJobRelation);
        if(record ==0){
            return "faild";
        }
        return "success";
    }

    @ApiOperation(value = "删除调度子作业执行历史",response = Integer.class)
    @RequestMapping(value = "/subjobExecutionsHis/{id}",method = RequestMethod.DELETE)
    public Object delete(@PathVariable int id){
        int record = iSchSubJobExecutionHisService.delete(id);
        if(record ==0){
            return "faild"; }
        return "success";
    }

    @ApiOperation(value = "修改调度子作业执行历史",response = SchSubJobExecutionHis.class)
    @RequestMapping(value = "/subjobExecutionsHis/{id}",method = RequestMethod.PUT)
    public Object update(@RequestBody SchSubJobExecutionHis schSubJobExecutionHis){
        int record = iSchSubJobExecutionHisService.update(schSubJobExecutionHis);
        if(record ==0){
            return "faild";
        }
        return "success";
    }
}
