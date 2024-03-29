package com.taotao.controller;

import com.taotao.common.pojo.TaotaoResult;
import com.taotao.pojo.TbItem;
import com.taotao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ItemController {
  @Autowired
  private ItemService itemService;

  @RequestMapping("/item/{itemId}")
  @ResponseBody
  public TbItem getItemById(@PathVariable Long itemId) {
    TbItem tbItem = itemService.getItemById(itemId);
    return tbItem;
  }

  @RequestMapping(value= "/item/save", method=RequestMethod.POST)
  @ResponseBody
  public TaotaoResult addItem(TbItem item, String desc) {
    return itemService.addItem(item, desc);
  }
}
