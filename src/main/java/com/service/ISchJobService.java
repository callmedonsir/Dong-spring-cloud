package com.service;

import com.entity.SchJob;

import java.util.List;

public interface ISchJobService {

    /**
     * 删除作业信息
     * @param id
     * @return
     */
    int delete(int id);

    /**
     * 新增作业信息
     * @param record
     * @return
     */

    int insert(SchJob record);

    /**
     * 查询，根据id查询
     *得出一个列表类的结果
     * @mbggenerated
     */
    List<SchJob> query(SchJob record);
    /**
     * 修改作业信息
     *
     * @mbggenerated
     */
    int update(SchJob record);
}
