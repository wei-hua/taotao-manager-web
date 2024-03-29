package com.taotao.controller;

import com.taotao.common.pojo.EasyUITreeNode;
import com.taotao.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ItemCatController {
  @Autowired
  ItemCatService itemCatService;
  @RequestMapping("/item/cat/list")
  @ResponseBody
  public List<EasyUITreeNode> getItemCatList(@RequestParam(name = "id", defaultValue = "0") Long parentId) {
    return itemCatService.getItemCatList(parentId);
  }
}
