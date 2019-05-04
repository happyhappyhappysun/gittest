package com.javen.mapper;

import java.util.List;

import com.javen.domain.Custom;

public interface CustomMapper {

	List<Custom> searchCustomByCustomName(int id);

}
