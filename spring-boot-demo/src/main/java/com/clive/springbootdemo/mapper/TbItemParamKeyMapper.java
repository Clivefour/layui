package com.clive.springbootdemo.mapper;

import com.clive.springbootdemo.bean.TbItemParamKey;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TbItemParamKeyMapper {
    @Select("SELECT * FROM tbitemparamkey WHERE groupId = #{groupId}")
    List<TbItemParamKey> findTbItemParamKeyByGroupId(Long groupId);
}
