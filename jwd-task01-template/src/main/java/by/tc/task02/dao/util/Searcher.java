package by.tc.task02.dao.util;

import by.tc.task02.entity.SportEquipment;
import by.tc.task02.entity.category.Criteria;

import java.util.List;
import java.util.Map;

public class Searcher {

    public static SportEquipment searchGoodsForName(Criteria criteria, List<SportEquipment> rentedUnits, Shop shop) {
        SportEquipment equipment;
        String[] equipmentName = makeValue(criteria);
        for (Map.Entry<SportEquipment, Integer> entry : shop.getGoods().entrySet()) {
            equipment = entry.getKey();
            if (equipmentName[0].equals(equipment.getCategory().toString())) {
                if (equipmentName[1].equals(equipment.getTitle())) {
                    if (entry.getValue() > 0 && rentedUnits.size() < 3) {
                        int newQuantity = entry.getValue() - 1;
                        entry.getKey().setQuantity(newQuantity);
                        entry.setValue(newQuantity);
                        shop.getGoods().put(entry.getKey(), entry.getValue());
                        return equipment;
                    } else {
                        System.out.println("Извините , вы не можете больше взять");
                    }

                }
            }
        }
        return null;
    }

    private static String[] makeValue(Criteria criteria) {
        Map<String, String> mapOfCriteria = criteria.getCriteria();
        String value = mapOfCriteria.toString();
        value = value.replace("{", "");
        value = value.replace("}", "");
        String[] equipmentName;
        equipmentName = value.split("=");
        return equipmentName;
    }
}
