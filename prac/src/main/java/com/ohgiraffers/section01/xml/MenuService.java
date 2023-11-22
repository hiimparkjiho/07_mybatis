package com.ohgiraffers.section01.xml;

import com.ohgiraffers.common.model.MenuDTO;
import org.apache.ibatis.session.SqlSession;
import static com.ohgiraffers.common.Template.*;

import java.util.List;
import java.util.Map;

public class MenuService {
    private MenuMapperDAO mapper;
    public void selectAll(){
        SqlSession session = getSesseion();
        mapper = session.getMapper(MenuMapperDAO.class);

        List<MenuDTO> menuList = mapper.selectAll();
        for(MenuDTO menu : menuList){
            System.out.println(menu);
        }
        session.close();

    }

    public void updateMenu(Map<String, Object> MenuDTO){
        SqlSession session = getSesseion();
        mapper = session.getMapper(MenuMapperDAO.class);
        int result = mapper.updateMenu(MenuDTO);
        if(result > 0){
            System.out.println("수정 완료");
            session.commit();
        }else{
            System.out.println("수정 실패");
            session.rollback();
        }
        session.close();
    }
}
