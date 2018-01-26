package com.service.impl;

import com.dao.SchJobExecutionMapper;
import com.entity.SchJobExecution;
import com.service.ISchJobExecutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchJobExecutionImpl implements ISchJobExecutionService{
    @Autowired
    private SchJobExecutionMapper schJobExecutionMapper;

    public int delete(int id){
        int record = schJobExecutionMapper.deleteByPrimaryKey(id);
        return record;
    }

    public int insert(SchJobExecution schJobExecution){
        int record = schJobExecutionMapper.insert(schJobExecution);
        return record;
    }

    public List<SchJobExecution> query(){
        List<SchJobExecution> schJobExecutionList = schJobExecutionMapper.selectAll();
        return schJobExecutionList;
    }

    public int update(SchJobExecution schJobExecution){
        int record = schJobExecutionMapper.updateByPrimaryKey(schJobExecution);
        return record;
    }
}
