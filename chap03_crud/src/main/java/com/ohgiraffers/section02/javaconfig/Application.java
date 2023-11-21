package com.ohgiraffers.section02.javaconfig;
import com.ohgiraffers.section02.javaconfig.controller.MenuController;

import java.util.HashMap;
import java.util.Map;

public class Application {
    public static void main(String[] args){
        //처음 세팅 잘 됐는지 확인
        //System.out.println(getSqlSession());
        MenuController menuController = new MenuController();
//        Map<String, String> test = new HashMap<>();
//        test.put("name", "테스트 메뉴");
//        test.put("price", "3000");
//        test.put("category", "4");
//        menuController.registMenu(test);

//        MenuController menuController = new MenuController();
        Map<String, String> test = new HashMap<>();
        test.put("name", "테스트 메뉴");
        test.put("code", "4");
        test.put("status", "Y");
        test.put("price", "3000");
        test.put("category", "4");
//        //menuController.modifyMenu(test);
      menuController.selectAllMenu();

//        menuController.deleteMenu(4);

    }
}
