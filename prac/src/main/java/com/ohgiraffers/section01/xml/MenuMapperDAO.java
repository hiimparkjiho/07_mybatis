package com.ohgiraffers.section01.xml;

import com.ohgiraffers.common.model.MenuDTO;

import java.util.List;

public interface MenuMapperDAO {

    List<MenuDTO> selectAll();
}
