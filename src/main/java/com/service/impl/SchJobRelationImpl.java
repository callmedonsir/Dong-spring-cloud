package com.service.impl;

import com.dao.SchJobRelationMapper;
import com.entity.SchJobRelation;
import com.service.ISchJobRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchJobRelationImpl implements ISchJobRelationService {

    @Autowired
    private SchJobRelationMapper schJobRelationMapper;

    public int delete(int id){
        int record = schJobRelationMapper.deleteByPrimaryKey(id);
        return record;
    }

    public int insert(SchJobRelation schJobRelation){
        int record = schJobRelationMapper.insert(schJobRelation);
        return record;
    }

    public List<SchJobRelation> query(){
        List<SchJobRelation> schJobList = schJobRelationMapper.selectAll();
        return schJobList;
    }

    public int update(SchJobRelation schJobRelation){
        int record = schJobRelationMapper.insert(schJobRelation);
        return record;
    }
}
