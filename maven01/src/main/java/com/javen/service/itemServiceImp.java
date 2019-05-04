package com.javen.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javen.domain.Custom;
import com.javen.mapper.CustomMapper;
@Service
public class itemServiceImp implements itemService {

	//属性注入，mybatis是mapper接口和映射文件开发
	@Autowired
	public CustomMapper itemsMapper;
	@Override
	public List<Custom> selectItemsList(int id) {		
		return itemsMapper.searchCustomByCustomName(id);
	}

}
