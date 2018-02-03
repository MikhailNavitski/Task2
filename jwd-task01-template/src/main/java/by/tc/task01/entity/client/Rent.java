package by.tc.task01.entity.client;

import by.tc.task01.dao.file.FileApp;
import by.tc.task01.dao.shop.Shop;
import by.tc.task01.entity.SportEquipment;
import by.tc.task01.entity.category.Criteria;

import java.util.List;

public class Rent {
    public static void rent(Shop shop) {
        List<SportEquipment> rentedUnits;
        SportEquipment equipment;
        RentedUnits units = new RentedUnits();
        Renter renter = new Renter();
        Criteria criteria = new Criteria();

        criteria.add("BIKE", "LIV_Tempt_2");
        rentedUnits = RentedUnits.getRentedUnits();
        equipment = shop.searchGoodsForName(criteria, rentedUnits);
        renter.setItem(equipment);
        units.addUnit(equipment);
        criteria.remove("BIKE");

        criteria.add("BALL", "Mikasa_MVA_200");
        equipment = shop.searchGoodsForName(criteria, rentedUnits);
        renter.setItem(equipment);
        units.addUnit(equipment);
        criteria.remove("BALL");

        criteria.add("BALL", "Select_Futsal_Master");
        equipment = shop.searchGoodsForName(criteria, rentedUnits);
        renter.setItem(equipment);
        units.addUnit(equipment);
        criteria.remove("BALL");


        criteria.add("BALL", "Select_Futsal_Master");
        equipment = shop.searchGoodsForName(criteria, rentedUnits);
        renter.setItem(equipment);
        units.addUnit(equipment);
        criteria.remove("BALL");

        criteria.add("BALL", "Select_Futsal_Master");
        equipment = shop.searchGoodsForName(criteria, rentedUnits);
        renter.setItem(equipment);
        units.addUnit(equipment);
        criteria.remove("BALL");


        System.out.println("Товары , которые были отданы в прокат");
        FileApp.wtiteToFileRented(units);
        System.out.println("---------------------------------------");
        FileApp.readingFileRented();
        System.out.println("---------------------------------------");
    }
}
