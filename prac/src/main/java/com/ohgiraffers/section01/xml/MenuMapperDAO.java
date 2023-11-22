package com.ohgiraffers.section01.xml;

import com.ohgiraffers.common.model.MenuDTO;

import java.util.List;
import java.util.Map;

public interface MenuMapperDAO {

    List<MenuDTO> selectAll();
    int updateMenu(Map<String, Object> MenuDTO);
}
