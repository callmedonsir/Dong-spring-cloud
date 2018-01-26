package com.dao;

import com.entity.SchGlobalParam;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SchGlobalParamMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SchGlobalParam record);

    SchGlobalParam selectByPrimaryKey(Integer id);

    List<SchGlobalParam> selectAll();

    int updateByPrimaryKey(SchGlobalParam record);
}