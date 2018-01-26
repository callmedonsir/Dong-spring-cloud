package com.dao;

import com.entity.SchJobExecutionHis;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SchJobExecutionHisMapper {
    int deleteByPrimaryKey(@Param("id") Integer id);

    int insert(SchJobExecutionHis record);

    SchJobExecutionHis selectByPrimaryKey(@Param("id") Integer id, @Param("jobId") String jobId, @Param("preJobId") String preJobId);

    List<SchJobExecutionHis> selectAll();

    int updateByPrimaryKey(SchJobExecutionHis record);
}