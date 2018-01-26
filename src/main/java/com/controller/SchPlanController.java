package com.controller;

import com.entity.SchPlan;
import com.service.ISchPlanService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;


import java.io.PrintWriter;
import java.util.List;

@Api(tags = "调度计划信息")
@RestController
@RequestMapping("/scheduler")
public class SchPlanController {

    @Autowired
    private ISchPlanService iSchPlanService;

    @ApiOperation(value = "查询作业关系",response = SchPlan.class)
    @RequestMapping(value = "/plans",method = RequestMethod.GET)
    public Object query(@ApiIgnore SchPlan schPlan){
        List<SchPlan> schPlanList = iSchPlanService.query();
        return schPlanList;
    }

    @ApiOperation(value = "新增作业关系",response = Integer.class)
    @RequestMapping(value = "/plans",method = RequestMethod.POST)
    public Object insert(@RequestBody SchPlan schPlan){
        int record = iSchPlanService.insert(schPlan);
        if(record ==0){
            return "faild";
        }
        return "success";
    }

    @ApiOperation(value = "删除作业关系",response = Integer.class)
    @RequestMapping(value = "plans/{id}",method = RequestMethod.DELETE)
    public Object delete(@PathVariable int id){
        int record = iSchPlanService.delete(id);
        if(record ==0){
            return "faild"; }
        return "success";
    }

    @ApiOperation(value = "修改作业关系",response = SchPlan.class)
    @RequestMapping(value = "/plans/{id}",method = RequestMethod.PUT)
    public Object update(@RequestBody SchPlan schPlan){
        int record = iSchPlanService.update(schPlan);
        if(record ==0){
            return "faild";
        }
        return "success";
    }

}
