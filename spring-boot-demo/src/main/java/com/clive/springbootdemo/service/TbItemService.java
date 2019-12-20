package com.clive.springbootdemo.service;

import com.clive.springbootdemo.bean.*;

import java.util.List;

public interface TbItemService {
    List<TbItem> findTbItems();

    List<TbItem> findTbItemByPage(Integer page, Integer limit);
    List<TbItemCatResult> findItemCats();

    List<ZTreeNode> getCatList(long parentId);
    List<ParamResult> findParamByItemCatId(Long itemCatId);

    List<Vo> findVo(Long itemCatId);
    List<TbItemParamGroup> findParamGroups(Long itemCatId);
}
