package com.controller;

import com.dao.SchJobMapper;
import com.entity.SchJob;
import com.service.ISchJobService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.*;

@Api(tags = "调度作业信息")
@RestController
@RequestMapping("/scheduler")
public class SchJobController {

    @Autowired
    private ISchJobService iSchJobService;

    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",dataType = "int",value = "序列号",paramType = "query",required = false)
    })

    @ApiOperation(value = "查询作业信息",response = SchJob.class   )
    @RequestMapping(value = "/jobs",method = RequestMethod.GET)
    public Object get(@ApiIgnore SchJob schJob){
        List<SchJob> jobPageInfos = iSchJobService.query(schJob);
        return jobPageInfos;
    }

    @ApiOperation(value = "新增作业信息",response = Integer.class)
    @RequestMapping(value = "/jobs",method = RequestMethod.POST)
    public Object post(@RequestBody SchJob schJob){
        int  record = iSchJobService.insert(schJob);
        return record;
    }

    @ApiOperation(value = "删除作业信息",response = SchJob.class,notes="根据序列号id来指定删除对象")
    @RequestMapping(value ="/jobs/{id}",method = RequestMethod.DELETE)
    public Object delete(@PathVariable int id){
        int record = iSchJobService.delete(id);
        //如果找不到对应的字段，或字段不存在，怎么办？
        if(record==0){
            return "failed";
        }
        return "success";
    }

    @ApiOperation(value = "修改作业信息",response = SchJob.class)
    @RequestMapping(value = "/jobs/{id}",method = RequestMethod.PUT)
    public Object update(@RequestBody SchJob schJob){
        int record = iSchJobService.update(schJob);
        //如果找不到对应的字段，或字段不存在，怎么办？
        if(record==0){
            return "failed";
        }
        return "success";
    }
}
