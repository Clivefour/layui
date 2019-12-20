package com.clive.springbootdemo.bean;

import java.util.List;

public class Vo {
   private TbItemParamGroup group;
   private List<TbItemParamKey> paramKeyList;

   public TbItemParamGroup getGroup() {
      return group;
   }

   public void setGroup(TbItemParamGroup group) {
      this.group = group;
   }

   public List<TbItemParamKey> getParamKeyList() {
      return paramKeyList;
   }

   public void setParamKeyList(List<TbItemParamKey> paramKeyList) {
      this.paramKeyList = paramKeyList;
   }

   @Override
   public String toString() {
      return "Vo{" +
              "group=" + group +
              ", paramKeyList=" + paramKeyList +
              '}';
   }
}
