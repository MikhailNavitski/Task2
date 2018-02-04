package by.tc.task02.main;


import by.tc.task02.dao.util.RentedUnits;
import by.tc.task02.dao.util.Shop;
import by.tc.task02.entity.Renter;
import by.tc.task02.entity.SportEquipment;
import by.tc.task02.entity.category.Criteria;
import by.tc.task02.service.ServiceFactory;
import by.tc.task02.service.SportEquipmentService;

import java.util.List;

class Rent {
    static void rentSportEquipment(Shop shop, Renter renter) {
        ServiceFactory factory = ServiceFactory.getInstance();
        SportEquipmentService service = factory.getSportEquipmentService();

        List<SportEquipment> rentedUnits;
        SportEquipment equipment;
        RentedUnits units = new RentedUnits();
        Criteria criteria = new Criteria();

        RentedUnits.removeElements();
        rentedUnits = RentedUnits.getRentedUnits();

        if (shop.getClientRentedUnits().containsKey(renter)) {
            System.out.println("На данное имя уже были выданы товары");
        } else {
            criteria.add("BIKE", "LIV_Tempt_2");
            equipment = service.searchGoods(criteria, rentedUnits, shop);
            renter.setItem(equipment);
            service.addUnits(units,equipment);
            criteria.remove("BIKE");

            criteria.add("BALL", "Mikasa_MVA_200");
            equipment = service.searchGoods(criteria, rentedUnits, shop);
            renter.setItem(equipment);
            service.addUnits(units,equipment);
            criteria.remove("BALL");

            criteria.add("BALL", "Select_Futsal_Master");
            equipment = service.searchGoods(criteria, rentedUnits, shop);
            renter.setItem(equipment);
            service.addUnits(units,equipment);
            criteria.remove("BALL");


            criteria.add("BALL", "Select_Futsal_Master");
            equipment = service.searchGoods(criteria, rentedUnits, shop);
            renter.setItem(equipment);
            service.addUnits(units,equipment);
            criteria.remove("BALL");

            criteria.add("BALL", "Select_Futsal_Master");
            equipment = service.searchGoods(criteria, rentedUnits, shop);
            renter.setItem(equipment);
            service.addUnits(units,equipment);
            criteria.remove("BALL");
            shop.add(renter, units);
        }
    }
}
