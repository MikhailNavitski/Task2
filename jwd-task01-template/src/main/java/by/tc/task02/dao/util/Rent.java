package by.tc.task02.dao.util;


import by.tc.task02.entity.Renter;
import by.tc.task02.entity.SportEquipment;
import by.tc.task02.entity.category.Criteria;

import java.util.List;

public class Rent {
    public static RentedUnits rentSportEquipment(Shop shop, Renter renter) {
        List<SportEquipment> rentedUnits;
        SportEquipment equipment;
        RentedUnits units = new RentedUnits();
        Criteria criteria = new Criteria();

        RentedUnits.removeElements();
        rentedUnits = RentedUnits.getRentedUnits();


        criteria.add("BIKE", "LIV_Tempt_2");
        equipment = Searcher.searchGoodsForName(criteria, rentedUnits,shop);
        renter.setItem(equipment);
        units.addUnit(equipment);
        criteria.remove("BIKE");

        criteria.add("BALL", "Mikasa_MVA_200");
        equipment = Searcher.searchGoodsForName(criteria, rentedUnits,shop);
        renter.setItem(equipment);
        units.addUnit(equipment);
        criteria.remove("BALL");

        criteria.add("BALL", "Select_Futsal_Master");
        equipment = Searcher.searchGoodsForName(criteria, rentedUnits,shop);
        renter.setItem(equipment);
        units.addUnit(equipment);
        criteria.remove("BALL");


        criteria.add("BALL", "Select_Futsal_Master");
        equipment = Searcher.searchGoodsForName(criteria, rentedUnits,shop);
        renter.setItem(equipment);
        units.addUnit(equipment);
        criteria.remove("BALL");

        criteria.add("BALL", "Select_Futsal_Master");
        equipment = Searcher.searchGoodsForName(criteria, rentedUnits,shop);
        renter.setItem(equipment);
        units.addUnit(equipment);
        criteria.remove("BALL");
        return units;
    }
}
