package com.service.impl;

import com.dao.SchSubJobExecutionMapper;
import com.entity.SchSubJobExecution;
import com.service.ISchSubJobExecutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchSubJobExecutionImpl implements ISchSubJobExecutionService{

    @Autowired
    private SchSubJobExecutionMapper schSubJobExecutionMapper;

    public int delete(int id){
        int record = schSubJobExecutionMapper.deleteByPrimaryKey(id);
        return record;
    }

    public int insert(SchSubJobExecution schSubJobExecution){
        int record = schSubJobExecutionMapper.insert(schSubJobExecution);
        return record;
    }

    public List<SchSubJobExecution> query(){
        List<SchSubJobExecution> schJobList = schSubJobExecutionMapper.selectAll();
        return schJobList;
    }

    public int update(SchSubJobExecution schSubJobExecution){
        int record = schSubJobExecutionMapper.insert(schSubJobExecution);
        return record;
    }
}
