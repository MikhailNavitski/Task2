package by.tc.task02.main;

import by.tc.task02.dao.util.Shop;
import by.tc.task02.entity.SportEquipment;

import java.util.Map;

public class PrintInformation {
    public static void print(Shop shop){
        Map<SportEquipment , Integer> map = shop.getGoods();
        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey().toString()+ " Количество на складе = "+entry.getValue());


        }
    }
}
