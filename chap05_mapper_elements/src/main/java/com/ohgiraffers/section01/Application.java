package com.ohgiraffers.section01;
import com.ohgiraffers.section01.dto.CategoryDTO;
import com.ohgiraffers.section01.dto.MenuAndCaregory;

import static com.ohgiraffers.common.Template.*;
public class Application {
    public static void main(String[] args){
        ElementTestService service = new ElementTestService();
        //service.selectCacheTest();

        //service.selectResultMapTest();
        MenuAndCaregory menu = new MenuAndCaregory();
        //menu.getCategory().setCode();
        // menu = menuAndCategory의 heap의 주소값에 접근
        // menu.getCategory() return category(type CategoryDTO).
        MenuAndCaregory menuAndCaregory = new MenuAndCaregory();
//        menuAndCaregory.setName("베이글 햄버거");
//        menuAndCaregory.setPrice(1000);
//        menuAndCaregory.setOrderableStatus("Y");
//        menuAndCaregory.setCategory(new CategoryDTO("신규 카테고리"));
        service.selectResultMapAssociationTest();
    }
}
