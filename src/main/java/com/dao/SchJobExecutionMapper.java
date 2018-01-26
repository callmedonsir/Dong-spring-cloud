package com.dao;

import com.entity.SchJobExecution;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SchJobExecutionMapper {
    int deleteByPrimaryKey(@Param("id") Integer id);

    int insert(SchJobExecution record);

    SchJobExecution selectByPrimaryKey(@Param("id") Integer id);

    List<SchJobExecution> selectAll();

    int updateByPrimaryKey(SchJobExecution record);
}