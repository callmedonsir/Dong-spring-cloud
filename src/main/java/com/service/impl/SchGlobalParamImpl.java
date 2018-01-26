package com.service.impl;

import com.dao.SchGlobalParamMapper;
import com.entity.SchGlobalParam;
import com.service.ISchGlobalParamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchGlobalParamImpl implements ISchGlobalParamService {

    @Autowired
    private SchGlobalParamMapper schGlobalParamMapper;

    public List<SchGlobalParam> query(SchGlobalParam schGlobalParam){
        List<SchGlobalParam> schJobRelationList = schGlobalParamMapper.selectAll();
        return schJobRelationList;
    }

    public int insert(SchGlobalParam schGlobalParam){
        int record = schGlobalParamMapper.insert(schGlobalParam);
        return record;
    }

    public int deleteByPrimaryKey(int id){
        int record = schGlobalParamMapper.deleteByPrimaryKey(id);
        return record;
    }

    public int updateByPrimaryKey(SchGlobalParam schGlobalParam) {
        int record = schGlobalParamMapper.updateByPrimaryKey(schGlobalParam);
        return record;
    }
}
