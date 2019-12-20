package com.clive.springbootdemo.mapper;

import com.clive.springbootdemo.bean.*;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface TbItemMapper {
    @Select("SELECT * FROM tbitem")
    List<TbItem> findTbItems();
    @Select("SELECT * FROM tbitem LIMIT #{page},#{limit}")
    List<TbItem> findTbItemByPage(@Param("page") Integer page,@Param("limit")Integer limit);
    @Select("SELECT * FROM tbitemcat WHERE parentId = #{parentId}")
    List<TbItemCat> findTbItemCats(Long parentId);
    @Select("SELECT * FROM tbitemcat WHERE parentId = #{parentId}")
    List<TbItemCat> findTbItemCatById(Long parentId);
    @Select("SELECT g.groupName,k.id paramId,k.paramName FROM tbitemparamgroup g INNER JOIN tbitemparamkey k ON g.id = k.groupId WHERE g.itemCatId = #{itemCatId}")
    List<ParamResult> findParamByItemCatId(Long itemCatId);

    @Select("SELECT * FROM tbitemparamgroup WHERE itemCatId = #{itemCatId}")
    List<TbItemParamGroup> findGroupByCatId(Long itemCatId);

    @Select("SELECT * FROM tbitemparamkey WHERE groupId = #{groupId}")
    List<TbItemParamKey> findParamByGroupById(Long groupId);
}
