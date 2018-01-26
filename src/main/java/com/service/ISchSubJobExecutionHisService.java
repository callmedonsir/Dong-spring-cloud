package com.service;

import com.entity.SchSubJobExecutionHis;

import java.util.List;

public interface ISchSubJobExecutionHisService {
    int delete(int id);

    int insert(SchSubJobExecutionHis schSubJobExecutionHis);

    List<SchSubJobExecutionHis> query();

    int update(SchSubJobExecutionHis schSubJobExecutionHis);
}
