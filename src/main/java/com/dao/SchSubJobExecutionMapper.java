package com.dao;

import com.entity.SchSubJobExecution;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SchSubJobExecutionMapper {
    int deleteByPrimaryKey(@Param("id") Integer id);

    int insert(SchSubJobExecution record);

    SchSubJobExecution selectByPrimaryKey(@Param("id") Integer id);

    List<SchSubJobExecution> selectAll();

    int updateByPrimaryKey(SchSubJobExecution record);
}