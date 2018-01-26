package com.service.impl;

import com.dao.SchPlanMapper;
import com.entity.SchPlan;
import com.service.ISchPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SchPlanImpl implements ISchPlanService{

    @Autowired
    private SchPlanMapper schPlanMapper;

    public int delete(int id){
        int record = schPlanMapper.deleteByPrimaryKey(id);
        return record;
    }

    public int insert(SchPlan schPlan){
        int record = schPlanMapper.insert(schPlan);
        return record;
    }

    public List<SchPlan> query(){
        List<SchPlan> schJobList = schPlanMapper.selectAll();
        return schJobList;
    }

    public int update(SchPlan schPlan){
        int record = schPlanMapper.insert(schPlan);
        return record;
    }
}
