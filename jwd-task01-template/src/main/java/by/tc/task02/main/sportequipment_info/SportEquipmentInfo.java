package by.tc.task02.main.sportequipment_info;

import by.tc.task02.dao.util.Shop;
import by.tc.task02.entity.SportEquipment;

import java.util.Map;

public class SportEquipmentInfo {
    public static void printGoods(Shop shop){
        Map<SportEquipment,Integer> map = shop.getGoods();
        for (Map.Entry entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: "
                    + entry.getValue());
        }
    }
}
