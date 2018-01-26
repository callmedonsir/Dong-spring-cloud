package com.service.impl;

import com.dao.SchJobExecutionHisMapper;
import com.entity.SchJobExecutionHis;
import com.service.ISchJobExecutionHisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchJobExecutionHisImpl implements ISchJobExecutionHisService{
    @Autowired
    private SchJobExecutionHisMapper schJobExecutionHisMapper;

    public int delete(int id){
        int record = schJobExecutionHisMapper.deleteByPrimaryKey(id);
        return record;
    }

    public int insert(SchJobExecutionHis schJobExecutionHis){
        int record = schJobExecutionHisMapper.insert(schJobExecutionHis);
        return record;
    }

    public List<SchJobExecutionHis> query(){
        List<SchJobExecutionHis> schJobExecutionList = schJobExecutionHisMapper.selectAll();
        return schJobExecutionList;
    }

    public int update(SchJobExecutionHis schJobExecutionHis){
        int record = schJobExecutionHisMapper.updateByPrimaryKey(schJobExecutionHis);
        return record;
    }
}
