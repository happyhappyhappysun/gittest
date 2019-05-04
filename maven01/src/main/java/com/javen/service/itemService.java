package com.javen.service;

import java.util.List;

import com.javen.domain.Custom;

public interface itemService {
	//查询商品列表
		public List<Custom> selectItemsList(int id);
}
