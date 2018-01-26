package com.service;

import com.entity.SchPlanExecution;

import java.util.List;

public interface ISchPlanExecutionService {

    int delete(int id);

    int insert(SchPlanExecution schJobRelation);

    List<SchPlanExecution> query();

    int update(SchPlanExecution schJobRelation);

}
