package by.tc.task01.main;

import by.tc.task01.dao.GoodsFinder;
import by.tc.task01.dao.shop.Shop;
import by.tc.task01.entity.category.Criteria;
import by.tc.task01.entity.category.SearchCriteria;
import by.tc.task01.main.exception.FileReaderException;
import by.tc.task01.main.sportequipment_info.SportEquipmentInfo;
import by.tc.task01.service.ServiceFactory;
import by.tc.task01.service.SportEquipmentService;

import static by.tc.task01.entity.category.SearchCriteria.*;

public class Main {
    public static void main(String[] args) {
        try {
            Shop shop;
            ServiceFactory factory = ServiceFactory.getInstance();
            SportEquipmentService service = factory.getSportEquipmentService();
            shop = service.find();
            SportEquipmentInfo.printGoods(shop);
           //////////////////ПОИСК//////////////////////
            Criteria<SearchCriteria.WinterGoods> criteriaWinter = new Criteria<>();
            criteriaWinter.add(WinterGoods.skates,1);
            criteriaWinter.add(WinterGoods.skiing,1);
            GoodsFinder.find(criteriaWinter,shop);
        } catch (FileReaderException e) {
            e.getMessage();
        }

    }

}
