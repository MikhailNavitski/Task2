package by.tc.task01.dao;

import by.tc.task01.dao.shop.Shop;
import by.tc.task01.entity.SportEquipment;
import by.tc.task01.entity.category.Criteria;

import java.util.Map;


public class GoodsFinder {
    public static <E> void find(Criteria<E> criteria, Shop shop) {
        Map<SportEquipment, Integer> shopGoods = shop.getGoods();
        int count = 0;
        Map<E, Object> map = criteria.getCriteria();
        for (Map.Entry entry : shopGoods.entrySet()) {
            System.out.println(shopGoods.get("bike"));
        }


    }


}

