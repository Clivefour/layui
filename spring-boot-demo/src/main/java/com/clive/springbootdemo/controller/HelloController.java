package com.clive.springbootdemo.controller;

import com.clive.springbootdemo.bean.*;
import com.clive.springbootdemo.commom.JsonUtils;
import com.clive.springbootdemo.domain.TaoTaoResult;
import com.clive.springbootdemo.service.TbItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Controller
public class HelloController {
    @Autowired
    private TbItemService tbItemService;
//    @RequestMapping("/hello")
//    @ResponseBody
//    public TaoTaoResult hello(){
//        List<TbItem> tbItems = tbItemService.findTbItems();
//        TaoTaoResult result = new TaoTaoResult();
//        result.setCode(0);
//        result.setMsg("");
//        result.setCount(tbItems.size()+1);
//        result.setData(tbItems);
//
//        return  result;
//    }
    @RequestMapping("{page}")
    public String showPage(@PathVariable  String page){
        return  page;
    }
    @RequestMapping("/showTbItems")
    @ResponseBody
    public List<TbItem> getTbItems(@RequestParam("username")  String username){
        List<TbItem> tbItems = tbItemService.findTbItems();
        return tbItems;
    }
    @RequestMapping("/demo/table/user/")
    @ResponseBody
    public String findTbItems(Integer page,Integer limit){
        List<TbItem> tbItems = tbItemService.findTbItemByPage(page,limit);

        TaoTaoResult result = new TaoTaoResult();
        result.setCode(0);
        result.setMsg("");
        result.setData(tbItems);
        result.setCount(tbItems.size()+1);
        String json = JsonUtils.objectToJson(result);
        System.out.println(json);
        return json;
    }

    @RequestMapping("/item/cat/list")
    @ResponseBody
    public List<ZTreeNode> getItemCatList(@RequestParam(value="id", defaultValue="0")Long parentId) {

        List<ZTreeNode> list = tbItemService.getCatList(parentId);
        return list;
    }
    @RequestMapping("/item/add")
    public void addItem(TbItem tbItem,String content,String param) {
        System.out.println("---------------------------------");
        System.out.println(tbItem);
        System.out.println(content);
        System.out.println(param);
        System.out.println("==============================");
    }
    @RequestMapping("/upload")
    public void upload(MultipartFile file){
        System.out.println("---------------");
        System.out.println(file.getOriginalFilename());
        System.out.println("---------------");
    }
    @RequestMapping("/item/addDes")
    public void add(String content){
        System.out.println(content);
    }

    @RequestMapping("/param/{itemCatId}")
    @ResponseBody
    public List<TbItemParamGroup> showParam(@PathVariable Long itemCatId){
        List<TbItemParamGroup> results = tbItemService.findParamGroups(itemCatId);
        return results;


    }
    @RequestMapping("/test")
    public void test(String[] str){
        System.out.println(str);
    }
}
