package com.taotao.controller;

import com.taotao.pojo.TbItem;
import com.taotao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class ItemController {
  @Autowired
  private ItemService itemService;
  @RequestMapping("/item/{itemId}")
  @ResponseBody
  public TbItem getItemById(@PathVariable long itemId){
    TbItem tbItem = itemService.getItemById(itemId);
    return tbItem;
  }

}
