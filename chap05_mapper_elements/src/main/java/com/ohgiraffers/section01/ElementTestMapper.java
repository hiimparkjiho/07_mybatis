package com.ohgiraffers.section01;

import com.ohgiraffers.section01.dto.MenuAndCaregory;
import com.ohgiraffers.section01.dto.MenuDTO;
import com.ohgiraffers.section01.dto.collection.CategoryAndMenuDTO;

import java.util.List;

public interface ElementTestMapper {
    List<String> selectCacheTest();

    List<MenuDTO> selectResultMapTest();

    List<MenuDTO> selectResultMapConstructor();

    List<MenuAndCaregory> selectResultMapAssociationTest();

    List<CategoryAndMenuDTO> selectResultMapCollectionTest();

    List<MenuDTO> selectSqlTest();

    int insertNewCategory(MenuAndCaregory menuAndCaregory);
    int insertNewMenu(MenuAndCaregory menuAndCaregory);
}
