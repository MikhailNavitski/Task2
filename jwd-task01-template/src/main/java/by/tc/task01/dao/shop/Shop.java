package by.tc.task01.dao.shop;

import by.tc.task01.entity.SportEquipment;
import by.tc.task01.entity.category.Criteria;
import by.tc.task01.entity.client.Client;
import by.tc.task01.entity.client.Rent;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Shop implements Serializable {
    private static Map<SportEquipment, Integer> goods = new HashMap<>();
    private static Map<Client, Rent> clientRentedUnits = new HashMap<>();
    private static Rent units;

    public Map<SportEquipment, Integer> getGoods() {
        return goods;
    }

    public void add(SportEquipment equipment, Integer value) {
        goods.put(equipment, value);
    }

    public SportEquipment searchGoodsForName(Criteria criteria, List<SportEquipment> rentedUnits) {
        SportEquipment equipment;
        Map<String, String> mapOfCriteria = criteria.getCriteria();
        String value = mapOfCriteria.toString();
        value = value.replace("{", "");
        value = value.replace("}", "");
        String[] eqName = value.split("=");
        for (Map.Entry<SportEquipment, Integer> entry : goods.entrySet()) {
            equipment = entry.getKey();
            if (eqName[0].equals(equipment.getCategory().toString())) {
                if (eqName[1].equals(equipment.getTitle())) {
                    if (entry.getValue() > 0 && rentedUnits.size() < 3) {
                        int newQuantity = entry.getValue() - 1;
                        entry.getKey().setQuantity(newQuantity);
                        entry.setValue(newQuantity);
                        goods.put(entry.getKey(), entry.getValue());
                        return equipment;
                    }
                    else {
                        System.out.println("Извините , вы не можите больше взять");
                    }

                }
            }
        }
        return null;
    }
    public static void rent(Client client) {
        units = clientRentedUnits.get(client);
        if (units == null) {
            clientRentedUnits.put(client, new Rent());
        }

    }
}
