package com.dao;

import com.entity.SchPlanExecution;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SchPlanExecutionMapper {
    int deleteByPrimaryKey(@Param("id") Integer id);

    int insert(SchPlanExecution record);

    SchPlanExecution selectByPrimaryKey(@Param("id") Integer id);

    List<SchPlanExecution> selectAll();

    int updateByPrimaryKey(SchPlanExecution record);
}