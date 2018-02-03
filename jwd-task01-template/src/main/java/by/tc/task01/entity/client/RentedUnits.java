package by.tc.task01.entity.client;

import by.tc.task01.entity.SportEquipment;

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

    public  static List<SportEquipment>  getRentedUnits() {
        return rentedUnits;
    }

    public void setRentedUnits(List<SportEquipment> rentedUnits) {
        this.rentedUnits = rentedUnits;
    }
}





