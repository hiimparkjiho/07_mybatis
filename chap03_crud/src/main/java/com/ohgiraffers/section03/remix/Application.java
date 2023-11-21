package com.ohgiraffers.section03.remix;

import com.ohgiraffers.section03.remix.controller.MenuController;

import java.util.HashMap;
import java.util.Map;

public class Application {
    public static void main(String[] args){
        //처음 세팅 잘 됐는지 확인
        //System.out.println(getSqlSession());
        MenuController menuController = new MenuController();
         MenuController menu = new MenuController();
        menu.selectAllMenu();

        Map<String, String> value = new HashMap<>();
        value.put("name", "보리새우 떡볶이");
        value.put("price", "5000");
        value.put("category", "5");
        menu.registMenu(value);
        menuController.selectAllMenu();
    }
}
