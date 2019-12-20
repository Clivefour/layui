package com.clive.springbootdemo.service.impl;

import com.clive.springbootdemo.bean.*;
import com.clive.springbootdemo.mapper.TbItemMapper;
import com.clive.springbootdemo.service.TbItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class TbItemServiceImpl implements TbItemService{
    @Autowired
    private TbItemMapper tbItemMapper;
    @Override
    public List<TbItem> findTbItems() {
        List<TbItem> tbItems = tbItemMapper.findTbItems();
        return tbItems;
    }

    @Override
    public List<TbItem> findTbItemByPage(Integer page, Integer limit) {

        return tbItemMapper.findTbItemByPage((page-1)*limit,limit);
    }

    @Override
    public List<TbItemCatResult> findItemCats() {
        List<TbItemCatResult> results = new ArrayList<TbItemCatResult>();
        List<TbItemCat> tbItemCats = tbItemMapper.findTbItemCats(0L);
        for (TbItemCat itemCat:tbItemCats) {
            TbItemCatResult result = new TbItemCatResult();
            result.setTitle(itemCat.getName());
            result.setId(itemCat.getId());
            result.setField(itemCat.getName());
            List<Children> childrenList = new ArrayList<Children>();
            List<TbItemCat> tbItemCats1 = tbItemMapper.findTbItemCats(itemCat.getId());
            for (TbItemCat itemCat2:tbItemCats1) {
                Children children = new Children();
                children.setTitle(itemCat2.getName());
                children.setId(itemCat2.getId());
                children.setFixed(true);
                children.setField(itemCat2.getName());
                List<ChildrenX> childrenXList = new ArrayList<>();
                List<TbItemCat> tbItemCats2 = tbItemMapper.findTbItemCats(itemCat2.getId());
                for (TbItemCat itemCat3:tbItemCats2) {
                    ChildrenX childrenX = new ChildrenX();
                    childrenX.setId(itemCat3.getId());
                    childrenX.setTitle(itemCat3.getName());
                    childrenX.setField(itemCat3.getName());
                    childrenXList.add(childrenX);
                }

                childrenList.add(children);
                children.setChildren(childrenXList);
            }
            result.setChildren(childrenList);
            results.add(result);
        }

        return results;
    }

    @Override
    public List<ZTreeNode> getCatList(long parentId) {
        List<ZTreeNode> nodes = new ArrayList<ZTreeNode>();
        List<TbItemCat> tbItemCats = tbItemMapper.findTbItemCatById(parentId);
        for (TbItemCat cat:tbItemCats) {
            ZTreeNode node = new ZTreeNode();
            node.setId(cat.getId());
            node.setName(cat.getName());
            node.setIsParent(cat.getIsParent());
            nodes.add(node);
        }
        return nodes;
    }

    @Override
    public List<ParamResult> findParamByItemCatId(Long itemCatId) {
        List<ParamResult> results = tbItemMapper.findParamByItemCatId(itemCatId);


        return results;
    }

    @Override
    public List<Vo> findVo(Long itemCatId) {


        return null;
    }

    @Override
    public List<TbItemParamGroup> findParamGroups(Long itemCatId) {
        List<TbItemParamGroup> groups = tbItemMapper.findGroupByCatId(itemCatId);
        for (TbItemParamGroup group:groups) {
            List<TbItemParamKey> keyList = tbItemMapper.findParamByGroupById(group.getId());
            group.setParamKeyList(keyList);
        }
        return groups;
    }


}
