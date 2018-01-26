package com.dao;

import com.entity.SchJob;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface SchJobMapper {

    /**
     * 删除作业信息
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

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
    List<SchJob> selectByPrimaryKey(SchJob record);
    /**
     * 修改作业信息
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SchJob record);
}