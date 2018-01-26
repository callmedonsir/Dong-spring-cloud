package com.service.impl;

import com.dao.SchSubJobExecutionHisMapper;
import com.entity.SchSubJobExecutionHis;
import com.service.ISchSubJobExecutionHisService;
import com.service.ISchSubJobExecutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchSubJobExecutionHisImpl implements ISchSubJobExecutionHisService{

    @Autowired
    private SchSubJobExecutionHisMapper schSubJobExecutionHisMapper;

    public int delete(int id){
        int record = schSubJobExecutionHisMapper.deleteByPrimaryKey(id);
        return record;
    }

    public int insert(SchSubJobExecutionHis schSubJobExecutionHis){
        int record = schSubJobExecutionHisMapper.insert(schSubJobExecutionHis);
        return record;
    }

    public List<SchSubJobExecutionHis> query(){
        List<SchSubJobExecutionHis> schJobList = schSubJobExecutionHisMapper.selectAll();
        return schJobList;
    }

    public int update(SchSubJobExecutionHis schSubJobExecutionHis){
        int record = schSubJobExecutionHisMapper.insert(schSubJobExecutionHis);
        return record;
    }

}
