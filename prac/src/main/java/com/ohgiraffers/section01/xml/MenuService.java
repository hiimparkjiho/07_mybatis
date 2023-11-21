package com.ohgiraffers.section01.xml;

import com.ohgiraffers.common.model.MenuDTO;
import org.apache.ibatis.session.SqlSession;
import static com.ohgiraffers.common.Template.*;

import java.util.List;

public class MenuService {
    private MenuMapperDAO mapper;
    public void selectAll(){
        SqlSession session = getSesseion();
        mapper = session.getMapper(MenuMapperDAO.class);

        List<MenuDTO> menuList = mapper.selectAll();

    }
}
