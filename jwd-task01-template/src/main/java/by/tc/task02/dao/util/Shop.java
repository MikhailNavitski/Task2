package by.tc.task02.dao.util;

import by.tc.task02.entity.Renter;
import by.tc.task02.entity.SportEquipment;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Shop implements Serializable {
    private static Map<SportEquipment, Integer> goods = new HashMap<>();
    private static Map<Renter, RentedUnits> clientRentedUnits = new HashMap<>();

    public Map<SportEquipment, Integer> getGoods() {
        return goods;
    }

    public Map<Renter, RentedUnits> getClientRentedUnits() {
        return clientRentedUnits;
    }


    public void add(SportEquipment equipment, Integer value) {
        goods.put(equipment, value);
    }

    public void add(Renter renter, RentedUnits rentedUnits) {
        clientRentedUnits.put(renter, rentedUnits);
    }


}
