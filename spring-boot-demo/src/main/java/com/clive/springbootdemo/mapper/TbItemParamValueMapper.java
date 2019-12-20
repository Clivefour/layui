package com.clive.springbootdemo.mapper;

import com.clive.springbootdemo.bean.TbItemParamValue;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TbItemParamValueMapper {
    @Select("SELECT * FROM tbitemparamkey WHERE paramId = #{paramId}")
    List<TbItemParamValue> findTbItemParamValueByParamKey(Long paramId);
}
