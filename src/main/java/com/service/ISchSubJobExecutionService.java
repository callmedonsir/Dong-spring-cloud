package com.service;

import com.entity.SchSubJobExecution;

import java.util.List;

public interface ISchSubJobExecutionService {

    int delete(int id);

    int insert(SchSubJobExecution schSubJobExecution);

    List<SchSubJobExecution> query();

    int update(SchSubJobExecution schSubJobExecution);
}
