package com.ohgiraffers.section01.xml;

import java.util.HashMap;
import java.util.Map;

public class Application {
    public static void main(String[] args){
        MenuService menuService = new MenuService();

        Map<String, Object> test = new HashMap<>();
        test.put("menuName", "버섯만두국");
        test.put("price", 5000);
        test.put("categoryCode", 1);
        test.put("orderableStatus", "Y");
        test.put("menuCode", 1);
        menuService.updateMenu(test);
        menuService.selectAll();
    }
}
