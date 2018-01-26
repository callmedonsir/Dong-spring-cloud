package com.dao;

import com.entity.SchPlan;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SchPlanMapper {
    int deleteByPrimaryKey(@Param("id") Integer id);

    int insert(SchPlan record);

    SchPlan selectByPrimaryKey(@Param("id") Integer id);

    List<SchPlan> selectAll();

    int updateByPrimaryKey(SchPlan record);
}