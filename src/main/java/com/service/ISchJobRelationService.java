package com.service;

import com.entity.SchJobRelation;

import java.util.List;

public interface ISchJobRelationService {

    int delete(int id);

    int insert(SchJobRelation schJobRelation);

    List<SchJobRelation> query();

    int update(SchJobRelation schJobRelation);
}
