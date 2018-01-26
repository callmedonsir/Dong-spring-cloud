package com.service;


import com.entity.SchGlobalParam;
import java.util.List;

public interface ISchGlobalParamService {

    List<SchGlobalParam> query(SchGlobalParam schGlobalParam);

    int insert(SchGlobalParam schGlobalParam);

    int deleteByPrimaryKey(int id);

    int updateByPrimaryKey(SchGlobalParam schGlobalParam);
}
