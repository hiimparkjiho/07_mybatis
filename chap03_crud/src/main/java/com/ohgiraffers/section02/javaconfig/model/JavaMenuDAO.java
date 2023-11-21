package com.ohgiraffers.section02.javaconfig.model;

import com.ohgiraffers.dto.MenuDTO;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public interface JavaMenuDAO {
    @Results(id="menuResultMap", value= {
            @Result(id = true, property = "code", column = "MENU_CODE"),
            @Result(property = "name", column = "MENU_NAME"),
            @Result(property = "price", column = "MENU_PRICE"),
            @Result(property = "categoryCode", column = "CATEGORY_CODE"),
            @Result(property = "orderableStatus", column = "ORDERABLE_STATUS"),
    })
    @Select("SELECT MENU_CODE," +
            "       MENU_PRICE," +
            "       MENU_NAME," +
            "       CATEGORY_CODE," +
            "       ORDERABLE_STATUS" +
            "  FROM TBL_MENU" +
            " WHERE ORDERABLE_STATUS = 'Y'" +
            " ORDER BY MENU_CODE")
    public List<MenuDTO> selectAllMenu(SqlSession sqlSession);

    @Select("SELECT MENU_CODE\n" +
            "     , MENU_NAME\n" +
            "     , MENU_PRICE\n" +
            "     , CATEGORY_CODE\n" +
            "     , ORDERABLE_STATUS\n" +
            "  FROM TBL_MENU\n" +
            " WHERE ORDERABLE_STATUS = 'Y'\n" +
            "   AND MENU_CODE = #{ code }")
    @ResultMap("menuResultMap")
    public MenuDTO selectByMenuCode(int code);

    @Select("SELECT MENU_CODE\n" +
            "     , MENU_NAME\n" +
            "     , MENU_PRICE\n" +
            "     , CATEGORY_CODE\n" +
            "     , ORDERABLE_STATUS\n" +
            "  FROM TBL_MENU\n" +
            " WHERE ORDERABLE_STATUS = 'Y'\n" +
            "   AND MENU_CODE = #{ code }")
    @ResultMap("menuResultMap")
    public int registMenu(MenuDTO menu);

    public int modifyMenu(SqlSession session, MenuDTO menu);

    public int deleteMenu(SqlSession session, int code);
}
