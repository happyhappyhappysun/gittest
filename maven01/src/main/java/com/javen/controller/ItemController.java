package com.javen.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.javen.domain.Custom;
import com.javen.service.itemServiceImp;
import com.javen.service.itemService;

@Controller
public class ItemController {
	//属性注入
	@Autowired
	public itemService itemService;
	@RequestMapping(value="/item/itemlist.action")
	public ModelAndView itemList(){
		// 创建页面需要显示的商品数据
		//ArrayList list = new ArrayList();
		//list.add("你好！！");
		int id = 001;
		List<Custom> list = itemService.selectItemsList(id);
		ModelAndView mav = new ModelAndView();
		//数据
		mav.addObject("itemList", list);
		mav.setViewName("success");
		return mav;		
	}
}
