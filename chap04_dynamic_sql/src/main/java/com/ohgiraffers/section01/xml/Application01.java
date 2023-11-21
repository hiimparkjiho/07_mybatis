package com.ohgiraffers.section01.xml;
import com.ohgiraffers.common.model.SearchCriteria;

import java.util.*;

import static com.ohgiraffers.common.Template.*;
public class Application01 {
    public static void main(String[] args){
        MenuService menuService = new MenuService();

        //menuService.selectMenuByPrice(5000);
        //SearchCriteria searchCriteria = new SearchCriteria("menu", "1");

        //menuService.searchMenuBySubCategory(new SearchCriteria("menuCode", "1"));
        //menuService.searchMenuByRandomMenuCode(createRandomMenuCodeList());
        //menuService.searchMenuByCodeOrSearchAll(searchCriteria);

        //Map<String, Object> test = new HashMap<>();
        //test.put("nameValue", "마늘");
        //test.put("categoryValue", 4);
        //menuService.searchMenuByNameOrCategory(test);

        Map<String, Object> test = new HashMap<>();
        test.put("name", "새우튀김");
        //test.put("categoryCode", "5");
        test.put("orderableStatus", "Y");
        test.put("code", "1");
        menuService.modifyMenu(test);
    }

    public static List<Integer> createRandomMenuCodeList(){
        Set<Integer> set = new HashSet<>();
        while(set.size() < 5){
            int temp = ((int) (Math.random() * 21)) + 1;
            set.add(temp);
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);

        return list;
    }
}
