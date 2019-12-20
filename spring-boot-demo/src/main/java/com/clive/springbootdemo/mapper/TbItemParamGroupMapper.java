package com.clive.springbootdemo.mapper;

import com.clive.springbootdemo.bean.TbItemParamGroup;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TbItemParamGroupMapper {
    @Select("SELECT * FROM tbitemparamgroup WHERE itemCatId = #{itemCatId}")
    List<TbItemParamGroup> findTbItemParamGroupByCatId(Long itemCatId);
}
