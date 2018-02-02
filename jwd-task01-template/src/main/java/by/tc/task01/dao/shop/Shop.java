package by.tc.task01.dao.shop;

import by.tc.task01.entity.SportEquipment;

import java.util.HashMap;
import java.util.Map;

public class Shop {
    private static Map<SportEquipment,Integer> goods = new HashMap<>();

    public Map<SportEquipment, Integer> getGoods() {
        return goods;
    }

    public void add(SportEquipment equipment, Integer value) {
        goods.put(equipment, value);
    }
}
