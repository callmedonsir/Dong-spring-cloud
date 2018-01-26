package com.dao;

import com.entity.SchSubJobExecutionHis;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SchSubJobExecutionHisMapper {
    int deleteByPrimaryKey(@Param("id") Integer id);

    int insert(SchSubJobExecutionHis record);

    SchSubJobExecutionHis selectByPrimaryKey(@Param("id") Integer id);

    List<SchSubJobExecutionHis> selectAll();

    int updateByPrimaryKey(SchSubJobExecutionHis record);
}