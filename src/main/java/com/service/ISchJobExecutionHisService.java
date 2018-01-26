package com.service;

import com.entity.SchJobExecutionHis;

import java.util.List;

public interface ISchJobExecutionHisService {

    int delete(int id);

    int insert(SchJobExecutionHis schJobExecutionHis);

    List<SchJobExecutionHis> query();

    int update(SchJobExecutionHis schJobExecutionHis);
}
