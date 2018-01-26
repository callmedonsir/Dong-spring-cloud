package com.dao;

import com.entity.SchJobRelation;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SchJobRelationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SchJobRelation record);

    SchJobRelation selectByPrimaryKey(Integer id);

    List<SchJobRelation> selectAll();

    int updateByPrimaryKey(SchJobRelation record);
}