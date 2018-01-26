package com.service.impl;

import com.dao.SchJobMapper;
import com.entity.SchJob;
import com.service.ISchJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchJobImpl implements ISchJobService{

    @Autowired
    private SchJobMapper schJobMapper;

    public int delete(int id){
        int record = schJobMapper.deleteByPrimaryKey(id);
        return record;
    }

    public int insert(SchJob schJob){
        int record = schJobMapper.insert(schJob);
        return record;
    }

    public List<SchJob> query(SchJob schJob){
        List<SchJob> schJobList = schJobMapper.selectByPrimaryKey(schJob);
        return schJobList;
    }

    public int update(SchJob schJob){
        int record = schJobMapper.insert(schJob);
        return record;
    }
}
