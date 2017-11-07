package com.paic.dmz.common.dao;

import com.paic.dmz.common.entity.RunoobTbl;
import com.paic.dmz.common.entity.RunoobTblExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RunoobTblMapper {
    int countByExample(RunoobTblExample example);

    int deleteByExample(RunoobTblExample example);

    int deleteByPrimaryKey(Integer runoobId);

    int insert(RunoobTbl record);

    int insertSelective(RunoobTbl record);

    List<RunoobTbl> selectByExample(RunoobTblExample example);

    RunoobTbl selectByPrimaryKey(Integer runoobId);

    int updateByExampleSelective(@Param("record") RunoobTbl record, @Param("example") RunoobTblExample example);

    int updateByExample(@Param("record") RunoobTbl record, @Param("example") RunoobTblExample example);

    int updateByPrimaryKeySelective(RunoobTbl record);

    int updateByPrimaryKey(RunoobTbl record);
}