package com.service.impl;

import com.dao.SchPlanExecutionMapper;
import com.entity.SchPlanExecution;
import com.service.ISchPlanExecutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SchPlanExecutionImpl implements ISchPlanExecutionService{

    @Autowired
    private SchPlanExecutionMapper schPlanExecutionMapper;

    public int delete(int id){
        int record = schPlanExecutionMapper.deleteByPrimaryKey(id);
        return record;
    }

    public int insert(SchPlanExecution schPlanExecution){
        int record = schPlanExecutionMapper.insert(schPlanExecution);
        return record;
    }

    public List<SchPlanExecution> query(){
        List<SchPlanExecution> schJobList = schPlanExecutionMapper.selectAll();
        return schJobList;
    }

    public int update(SchPlanExecution schPlanExecution){
        int record = schPlanExecutionMapper.insert(schPlanExecution);
        return record;
    }
}
