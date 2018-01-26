package com.service;

import com.entity.SchJobExecution;
import java.util.List;

public interface ISchJobExecutionService {

    int delete(int id);

    int insert(SchJobExecution schJobExecution);

    List<SchJobExecution> query();

    int update(SchJobExecution schJobExecution);
}
