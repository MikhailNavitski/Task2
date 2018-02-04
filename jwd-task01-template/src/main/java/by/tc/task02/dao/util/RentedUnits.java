package by.tc.task02.dao.util;

import by.tc.task02.entity.SportEquipment;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class RentedUnits implements Serializable {
    private static List<SportEquipment> rentedUnits = new ArrayList<>();

    public RentedUnits() {
    }


    public void addUnit(SportEquipment equipment) {
        if (rentedUnits.size() < 3) {
            rentedUnits.add(equipment);
        }

    }

    public static void removeElements() {
        rentedUnits.removeAll(rentedUnits);
    }

    public static List<SportEquipment> getRentedUnits() {
        return rentedUnits;
    }

    public void setRentedUnits(List<SportEquipment> rentedUnits) {
        this.rentedUnits = rentedUnits;
    }

    @Override
    public String toString() {
        return "RentedUnits{}"+rentedUnits;
    }
}





