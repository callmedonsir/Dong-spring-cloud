package com.service;

import com.entity.SchPlan;

import java.util.List;

public interface ISchPlanService {

    int delete(int id);

    int insert(SchPlan schPlan);

    List<SchPlan> query();

    int update(SchPlan schPlan);

}
